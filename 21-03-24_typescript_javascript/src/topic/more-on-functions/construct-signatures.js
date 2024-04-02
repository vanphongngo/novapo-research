function fn(ctor) {
    return new ctor("hello");
}
var MyClass = /** @class */ (function () {
    function MyClass(a) {
        this.a = a;
    }
    Object.defineProperty(MyClass.prototype, "getA", {
        get: function () {
            return this.a;
        },
        enumerable: false,
        configurable: true
    });
    return MyClass;
}());
(function () {
    var a = fn(MyClass);
    console.log(a.getA);
})();
