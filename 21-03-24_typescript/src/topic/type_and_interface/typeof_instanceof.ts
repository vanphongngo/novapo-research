

class MyAnimal {
  private name:string;
  constructor(name:string) {
    this.name = name;
  }
}

const animal = new MyAnimal("novapo");

console.log("instanceof: ",animal instanceof MyAnimal);



