function checkMember() {
		let form = document.member;
		let id = form.memberId.value;
		let pw1 = form.passwd1.value;
		let pw2 = form.passwd2.value;
		let name = form.name.value;
		/*let phone = form.phone1.value
		+ "-" + form.phone2.value 
		+ "-" + form.phone3.value;*/
		
		// 정규 표현식
		let pw_pat1 = /[0-9]+/
		let pw_pat2 = /[a-zA-Z]+/ // 영어만
		let pw_pat3 = /[!!@#$%^&*()_=]+/ // 특수문자만
		
		if(id.length < 4 || id.length > 15){
			alert("아이디는 4~15자 까지 입력 가능합니다.");
			form.memberId.focus();
			return false;
		}else if (pw1.length < 8 || !pw_pat1.test(pw1) || !pw_pat2.test(pw1) || !pw_pat3.test(pw1)) {
			alert("비밀번호는 8자리이상 특수문자 포함 입니다.");
			form.passwd1.focus();
			return false;
		}else if(pw1 != pw2){
			alert("비밀번호가 일치하지 않습니다.");
			form.passwd1.value = "";
			form.passwd2.value = "";
			form.passwd1.focus();
			return false;
			
		}else if (name == "" || pw_pat1.test(name) || pw_pat3.test(name)) {
			alert("이름은 입력해 주세요.");
			form.name.focus();
			return false;
		}/*else if (!regExpPhone.test(phone)) {
			alert("연락처를 확인해 주세요!!");
			form.phone2.select();
			return false;*/
			else{
			form.submit();		
		}
		
	}