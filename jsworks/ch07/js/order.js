// 체크 박스 속성에 이벤트 처리하기
window.onload = function () {
    let check = document.querySelector("#shippingInfo");

    // 체크 이벤트 구현
    check.addEventListener("click", checkBox);

    let billingName = document.getElementById("bliilingName");
    let billingTel = document.getElementById("billingTel");
    let billingAddr = document.getElementById("billingAddr");

    let shippingName = document.getElementById("shippingName");
    let shippingTel = document.getElementById("shippingTel");
    let shippingAddr = document.getElementById("shippingAddr");

    function checkBox() {
        // 체크시 기본 정보 값을 배송 정보에 저장
        if (check.checked == true) {
            shippingName.value = billingName.value;
            shippingTel.value = billingTel.value;
            shippingAddr.value = billingAddr.value;
        } else {
            shippingName.value = " ";
            shippingTel.value = " ";
            shippingAddr.value = " ";
        }
    } // 체크박스닫기
}// onload 닫기