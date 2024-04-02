
// mapping modifiers 

type Features = {
  darkMode?: string;
  newUserProfile: string;
};


type OptionsFlags<Type> = {
    [Property in keyof Type]-?: Type[Property];
  };

   
type FeatureOptions = OptionsFlags<Features>;

// Key Remapping via as

type Getters<Type> = {
    [Property in keyof Type as `get${Capitalize<string & Property>}`]: () => Type[Property]
};
 
interface Person {
    name: string;
    age: string;
    location: string;
}
 
type LazyPerson = Getters<Person>;

const myMap : {
    [key:number]:any } = [];
