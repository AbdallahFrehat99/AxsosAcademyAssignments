var firstNum, secondNum, operation;
var calc=0;

function press(num) {
    let displayVariable = document.querySelector("#display");
    if (displayVariable.innerText == 0) {
        displayVariable.innerText = num;
    } 
    else if(calc==0){
        displayVariable.innerText += num;
    }
    else{
        displayVariable.innerText = num;

    }
}
function setOP(el) {
    let displayVariable = document.querySelector("#display");
    // console.log(el);
    operation = el;
    firstNum = parseFloat(displayVariable.innerText);
    displayVariable.innerText = 0;
    // console.log(firstNum);
}
function clr() {
    let displayVariable = document.querySelector("#display");
    displayVariable.innerText = 0;
    firstNum = null;
    secondNum = null;
    operation = null;
}
function calculate() {
    let displayVariable = document.querySelector("#display");
    secondNum = parseFloat(displayVariable.innerText)
    // console.log(operation);
    // console.log(secondNum);
    switch (operation) {
        case "+":
            calc = firstNum + secondNum;
            break;
        case "-":
            calc = firstNum - secondNum;
            break;
        case "*":
            calc = firstNum * secondNum;
            break;
        case "/":
            calc = firstNum / secondNum;
            break;
        default:
            calc = "Invalid"
    }
    displayVariable.innerText = calc;
    firstNum = calc;  
    operation = null; 
}
