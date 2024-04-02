function f(key: string): any {
  console.log("evaluate: ", key);
  return function () {
    console.log("call: ", key);
  };
}

class C {
  method(
    @f("Parameter Foo") foo:any,
    @f("Parameter Bar") bar:any
  ) {
  }
}

export default function execute03() {
  let cc = new C();
}