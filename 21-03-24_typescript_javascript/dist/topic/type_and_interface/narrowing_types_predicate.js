"use strict";
//narrowing is mean after check type condition, it will narrow the type to valiate
function isFish(pet) {
    return pet.swim !== undefined;
}
function checkFish(pet) {
    if ("swim" in pet)
        return true;
    else
        return false;
}
const a = "novapo";
function doSomething(pet) {
    if (checkFish(pet)) {
        pet.swim();
    }
}
