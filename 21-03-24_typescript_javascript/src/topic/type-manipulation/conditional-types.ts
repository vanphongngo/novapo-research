// T extends any[] <=> T is an array
type Flatten<T> = T extends any[] ? T[number] : T;

 
// Extracts out the element type.
type Strr = Flatten<string[]>;

const aab : string[] = ["lfkjaklf","sefsf"];
const b = aab[1];
     
 
// Leaves the type alone.
type Numm = Flatten<number>;
     
const anyArray : any[] = ["fsef",1,{}];
const stringArr : string[] = ["sefes","sefesf"];

