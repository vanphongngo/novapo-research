"use strict";
class MyAnimal {
    constructor(name) {
        this.name = name;
    }
}
const animal = new MyAnimal("novapo");
console.log("instanceof: ", animal instanceof MyAnimal);
