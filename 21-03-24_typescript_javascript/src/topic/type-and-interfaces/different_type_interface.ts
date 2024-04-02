// different between interface and types
/*
    - in many cases, we can choose between them freely
    - type cannot be re-open to add new fields 
*/

type Type_Animal = {
  eye: string;
};

interface Interface_Animal {
  eye: string;
}

interface Interface_Animal {
  //=> re-open to add properties, but cannot with type
  move: string;
}

interface Interface_Dog extends Interface_Animal {
  move: string;
}

interface Interface_Cat extends Interface_Animal {
  eat: string;
}

type Type_Dog = Type_Animal & {
  move: string;
};

function get(a: Interface_Cat | Interface_Dog) {}

type Type_A = {
  name: string;
};

type Type_B = {
  code: string;
};

type Type_C = Type_A & Type_B;

type Type_D = { name: string } & { code: string };

const ddd: Type_D = {
  name: "hello",
  code: "kkaa",
};

const ccc: Type_C = {
  name: "hello",
  code: "hello",
};
