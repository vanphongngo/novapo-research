// we cannot do anything with type unknown, so unknown type is safer than any

function f1(a: any) {
  a.b(); // OK
}
function f2(a: unknown) {
  a.b();
}
