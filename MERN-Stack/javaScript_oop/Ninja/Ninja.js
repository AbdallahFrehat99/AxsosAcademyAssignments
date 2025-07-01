class Ninja{

    constructor (name, health){
        this.name = name;
        this.health = health;
        this.speed =3;
        this.strength =3;
    }

    sayName(){
        console.log(`Hi, I am ${this.name}!`);
    }
    showStats(){
        console.log(`Name: ${this.name}, Health: ${this.health}, Speed: ${this.speed}, strength: ${this.strength}`);

    }
    drinkSake(){
        this.health +=10;
    }
}

const ninja = new Ninja("Abdallah", 100);

ninja.sayName();
ninja.showStats();
console.log("-----------------------------------------------------------------");
ninja.drinkSake();
ninja.showStats();
