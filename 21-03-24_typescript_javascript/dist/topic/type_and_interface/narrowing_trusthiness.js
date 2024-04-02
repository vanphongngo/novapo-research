"use strict";
function printAll(strs) {
    if (strs && typeof strs === "object") {
        for (const s of strs) {
            console.log(s);
        }
    }
    else if (typeof strs === "string") {
        console.log(strs);
    }
}
function printAll2(strs) {
    // !!!!!!!!!!!!!!!!
    //  DON'T DO THIS!
    //   KEEP READING
    // !!!!!!!!!!!!!!!!
    // this will bypass the empty string
    if (strs) {
        if (typeof strs === "object") {
            for (const s of strs) {
                console.log("array", s);
            }
        }
        else if (typeof strs === "string") {
            console.log(strs);
        }
    }
}
const strs = ["", "fsees", "", "sefesf"];
printAll2(strs);
