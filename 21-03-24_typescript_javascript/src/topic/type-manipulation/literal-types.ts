type PropEventSource<Type> = {
  on(
    eventName: `${string & keyof Type}Changed`,
    callback: (newValue: any) => void
  ): void;
};

function makeWatchedObject<Type>(obj: Type): Type & PropEventSource<Type> {
  const cache = new Map<string | symbol, (newValue: any) => void>();
  const on = (change: string | symbol, callback: (newValue: any) => void) => {
    cache.set(
      typeof change === "string" ? change.replace("Changed", "") : change,
      callback
    );
  };
  return new Proxy<Type & PropEventSource<Type>>(
    {
      ...obj,
      on: on,
    },
    {
      set: (target: Type, p: string | symbol, newValue: any) => {
        cache.get(p)?.(newValue);
        return true;
      },
    }
  );
}

const person = makeWatchedObject({
  firstName: "Saoirse",
  lastName: "Ronan",
  age: 26,
});

person.on("firstNameChanged", () => {
    console.log("hello");
});
