//유효성 검사
function checkMember(){
    let form = document.regForm;
    let id = form.user-id;
    let mail = form.email.mail;
    let pw1 = form.user-pw1;
    let pw2 = form.user-pw2;

    let pwd_pat1 = /[a-zA-z0-9]+$/; //영문 숫자
    let pwd_pat2 = /[!@#$%^&*]/; // 특수문자
    if(id.value.length <4){
        alert("아이디는 4~15자 까지 가능합니다.");
        id.select();
        return false;
    }else if(mail.value == ""){
        alert("이메일은 필수 입력 항목입니다.");
        mail.focus();
        return false;
    }else if(pw1.value.length <8 || !pwd_pat1.test(pw1.value)
    || !pwd_pat2.test(pw1.value)){
        alert("비밀번호는 영문자, 숫자, 특수문자 포함 8자 이상");
        pw1.select();
        return false;
    }else if(pw1.value != pw2.value){
        alert("비빌버호가 틀립니다.");
        pw2.select();
        return false;
    } else{
        form.submit();
    }

}