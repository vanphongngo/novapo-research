// different between interface and types 
/*
    - in many cases, we can choose between them freely
    - type cannot be re-open to add new fields 
*/

type Type_Animal =  {
    eye:string;
}

interface Interface_Animal {
    eye:string
}

interface Interface_Animal { //=> re-open to add properties, but cannot with type
    move: string;
}

interface Interface_Dog extends Interface_Animal {
    move: string;
}

interface Interface_Cat extends Interface_Animal {
    eat: string;
}

type Type_Dog = Type_Animal & {
    move: string
}


function get(a : Interface_Cat | Interface_Dog) {
}