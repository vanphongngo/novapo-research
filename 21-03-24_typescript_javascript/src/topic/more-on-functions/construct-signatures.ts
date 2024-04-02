type SomeConstructor = {
  new (s: string): MyClass;
};
function fn(ctor: SomeConstructor) {
  return new ctor("hello");
}

class MyClass {
  private a: string;
  constructor(a: string) {
    this.a = a;
  }
  get getA() {
    return this.a;
  }
}

(() => {
  const a = fn(MyClass);
  console.log(a.getA);
})();
