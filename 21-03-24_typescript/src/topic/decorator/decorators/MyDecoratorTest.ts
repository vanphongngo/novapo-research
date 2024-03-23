function observable(target:any,key:string) {
  console.log("target: ",target);
  console.log("key:", key);
  console.log("value:", target[key]);
  target[key] = "i am novapo";
}

class MyClass {
  @observable
  name:string = "hello";
}

export default function testDecorator() {
  const a = new MyClass();
  console.log(a.name);
}
