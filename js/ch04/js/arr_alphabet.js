// 배열에 알파벳 대문자 출력
let alphabet = new Array(26);
let char = 'A';

char = char.charCodeAt(0); // 0번 인덱스
// 아스키 코드를 찾는 함수 - charCodeAt()
//console.log(char); // code - 65 (ASCII-아스키코드)

//char++; // char = char +1;
//console.log(char); // code - 66 (ASCII-아스키코드)

// 문자로 출력해주는 함수 String.fromCharCode(ch)
//console.log(String.fromCharCode(char));

// 배열의 저장(입력)
/*
    alphaber[0] = ch
    alphaber[1] = ch+1
    alphaber[2] = ch+2
*/
for(let i=0; i<alphabet.length; i++){
    alphabet[i] = char;
    char++;
}

// 출력
for(let i=0; i<alphabet.length;i++){
    document.write(alphabet[i]+", "+String.fromCharCode(alphabet[i])+"<br>");
}

