// ----------------------------------------1----------------------------------------

// const cars = ['Tesla', 'Mercedes', 'Honda'];

// const [randomCar] = cars;
// const [, otherRandomCar] = cars;

// console.log(randomCar);//Tesla
// console.log(otherRandomCar);//Mercedes
// ----------------------------------------2----------------------------------------
// const employee = {
//     name: 'Elon',
//     age: 47,
//     company: 'Tesla'
// };

// const { name: otherName } = employee;

// //Error: Name is not defined

// console.log(name); //the error is gone when this is comminted
// console.log(otherName);
// ----------------------------------------3----------------------------------------
// const person = {
//     name: 'Phil Smith',
//     age: 47,
//     height: '6 feet'
// };

// const password = '12345';
// const { password: hashedPassword } = person;
// console.log(password);// 12345
// console.log(hashedPassword);// undefined

// ----------------------------------------4----------------------------------------

// const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
// const [, first] = numbers;
// const [,,, second] = numbers;
// const [,,,,,,,, third] = numbers;
// console.log(first == second); //false
// console.log(first == third); //true

// ----------------------------------------5----------------------------------------
const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]
};

const { key } = lastTest;
const { secondKey } = lastTest;
const [, willThisWork] = secondKey;


console.log(key);//value

console.log(secondKey);// [1, 5, 1, 8, 3, 3]

console.log(secondKey[0]);// 1

console.log(willThisWork); //5

