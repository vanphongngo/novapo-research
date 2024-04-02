type Constructor = { 
  new (...args: any[]): any 
};

function toString<T extends Constructor>(BaseClass: T) {
  return class extends BaseClass {
    toString() {
      return JSON.stringify(this);
    }
  };
}

@toString
class C {
  public foo = "foo";
  public num = 24;
}

export default function execute04() {
  console.log(new C().toString());
  let cc = new C();
}


interface myClass {
  a : string;
  b : number;
}

interface extendConstructor extends Constructor {
  a : string;
  b : number;
}


