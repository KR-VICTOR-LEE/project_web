
window.onload = function () {
    // 유효성 검사
    let id = document.getElementById("user-id");
    let pw1 = document.getElementById("user-pw1");
    let pw2 = document.getElementById("user-pw2");

    id.onchange = checkId;

    pw1.onchange = checkPw;
    pw2.onchange = comparePw;

    function checkId() {
        if (id.value.length < 4 || id.value.length > 15) {
            alert("4~15자리의 영문과 숫자로 입력해 주세요");
            id.select();
        }
    }

    function checkPw() {
        if (pw1.value.length < 8) {
            alert("비밀번호는 8자리 이상 입력해주세요.");
            pw1.select();
        }
    }

    function comparePw() {
        if (pw1.value != pw2.value) {
            alert("비밀번호가 일치하지 않습니다.");
            pw2.value = "";
            pw2.focus();
        }
    }
}
