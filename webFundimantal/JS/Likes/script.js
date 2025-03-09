function like(num){
    var likes =document.querySelector("#likes"+num);
    console.log(likes);
    likes.innerText = parseInt(likes.innerText) + 1;
}