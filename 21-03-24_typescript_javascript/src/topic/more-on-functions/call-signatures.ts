type DescribableFunction = {
  description: string;
  (someArg: number): boolean;
};
function doSomething2(fn: DescribableFunction) {
  console.log(fn.description + " returned " + fn(6));
}

function myFunc(someArg: number) {
  return someArg > 3;
}
myFunc.description = "default description";

doSomething2(myFunc);

function execute() {}

execute();
