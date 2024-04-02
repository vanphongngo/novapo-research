function printAll(strs: string | string[] | null) {
    if (strs && typeof strs === "object") {
      for (const s of strs) {
        console.log(s);
      }
    } else if (typeof strs === "string") {
      console.log(strs);
    }
  }

  function printAll2(strs: string | string[] | null) {
    // !!!!!!!!!!!!!!!!
    //  DON'T DO THIS!
    //   KEEP READING
    // !!!!!!!!!!!!!!!!
    // this will bypass the empty string
    if (strs) {
      if (typeof strs === "object") {
        for (const s of strs) {
          console.log("array",s);
        }
      } else if (typeof strs === "string") {
        console.log(strs);
      }
    }
  }

  const strs = ["","fsees","","sefesf"];
  printAll2(strs);
