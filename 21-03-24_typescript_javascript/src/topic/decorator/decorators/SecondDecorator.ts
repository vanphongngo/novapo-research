function f(key: string): any {
  console.log("evaluate: ", key);
  return function () {
    console.log("call: ", key);
  };
}

@f("Class Decorator")
class C {
  @f("Static Property")
  static prop?: number;

  @f("Static Method")
  static method(@f("Static Method Parameter") foo: any) {}

  constructor(@f("Constructor Parameter") foo: any) {}

  @f("Instance Method")
  method(@f("Instance Method Parameter") foo: any) {}

  @f("Instance Property")
  prop?: number;
}

export default function execute02() {

    let a = new C("class C");

    let b = new C("class B");

}

