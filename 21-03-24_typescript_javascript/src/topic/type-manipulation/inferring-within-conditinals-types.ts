type Flattenn<Type> = Type extends Array<infer Item> ? Item : Type;

interface MyElement {
    name: string;
}

const element : Array<MyElement> = [{
    name:"hello"
}];

interface Wrapper<Type> {
    type: Type
}

let elementFlatten: Flattenn<Array<Wrapper<MyElement>>>;



