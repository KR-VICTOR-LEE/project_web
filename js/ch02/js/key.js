// 'y' 키를 누르면 계속 반복 'n'키를 누르면 berak;
// 그 외에 키를 누르면 "키를 잘못 눌렀습니다."
while(true){
    let key = prompt("계속 반복할까요?", "y/n");
    
    if(key == 'y'|| key == 'Y'){
        alert("계속 반복합니다.");
    }else if(key == 'n'|| key == 'N'){
        alert("반복을 중단합니다.");
        break;
    }else {
        alert("다른키를 입력하셨습니다.");
    }
}
document.write("종료");