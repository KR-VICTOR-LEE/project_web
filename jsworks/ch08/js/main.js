window.onload = function(){
    let text = document.querySelector("h1");

    // window객체 scroll 이벤트 구현
    window.addEventListener('scroll',function(){
       let value = this.window.scrollY;
       console.log(value);
       if(value > 300){
        text.style.animation = "back_slide 1s ease-out";
       }else{
        text.style.animation = "go_slide 1s ease-out";
       }
    })
}