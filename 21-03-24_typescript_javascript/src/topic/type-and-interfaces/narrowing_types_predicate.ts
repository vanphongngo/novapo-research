//narrowing is mean after check type condition, it will narrow the type to valiate

type Fish = { swim: () => void };
type Bird = { fly: () => void };

function isFish(pet: Fish | Bird): pet is Fish {
    return (pet as Fish).swim !== undefined;
  }

function checkFish(pet: Fish | Bird) : pet is Fish {
    if ("swim" in pet) return true;
    else return false;

}

const a = "novapo";

function doSomething(pet: Fish | Bird){
    if (checkFish(pet)) {
        pet.swim();
    }
}