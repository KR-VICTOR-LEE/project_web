let age = prompt("나이 입력");
        let charge;

        // if(charge == 3000){
        //     document.write("일반인");
        // }else if(charge == 2000){
        //     document.write("초등학생");
        // }else{
        //     document.write("유치원");
        // }
        if(age < 8){
            document.write("취학전 아동입니다 <br>");
            charge = 1000;
        }else if(age >= 8 && age < 14){
            document.write("초등학생 입니다 <br>");
            charge = 2000;
        }else if(age >= 15 && age < 19){
            document.write("청소년 입니다 <br>");
            charge = 2500;
        }else{
            document.write("일반 입니다  <br>");
            charge = 3000;
        }
        document.write("요금은 : <span class='access'>"+charge+"원 </span>입니다.");