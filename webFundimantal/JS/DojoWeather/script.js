function acceptCookie() {
    var cookie = document.querySelector(".cookie");
    cookie.remove();
}

function changeTemperature(deg) {
    // (1°C × 9/5) + 32 = 33.8°F
    // (32°F − 32) × 5/9 = 0°C
    var tempr = document.querySelectorAll("span");
    for (var i = 0; i < tempr.length; i++) {
        if (deg.value == "F") {
            var x = parseInt(tempr[i].innerText);
            tempr[i].innerText = (x * 9 / 5) + 32 +"°"
        }else{
            var y = parseFloat(tempr[i].innerText);
            tempr[i].innerText =parseInt((y-32)*(5/9))+"°"
        }
    }

}