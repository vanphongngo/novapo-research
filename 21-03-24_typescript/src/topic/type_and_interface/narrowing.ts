//narrowing is mean after check the condit

export type Fish = { swim: () => void };
export type Bird = { fly: () => void };
 
function move(animal: Fish | Bird) {
  if ("swim" in animal) {
    return animal.swim();
  }
 
  return animal.fly();
}