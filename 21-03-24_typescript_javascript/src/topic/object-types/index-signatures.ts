interface StringArray {
    [index:number]:string;
}

const stringArray : StringArray = ["hello","fsef","fsefe"];
stringArray[3] = "hello";

const array2 :StringArray = {
    1: "hello",
    2: "kakka",
    100: "hello"
}

console.log(array2[2]);

interface NumberArray {
    [index:string] : string
};

const numArray : NumberArray = {
    "hello":"hello"
};

numArray["hello"] = "hello";
numArray.hello = "helo";
numArray.kaka = "helj";
