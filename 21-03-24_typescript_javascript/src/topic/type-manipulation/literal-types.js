var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
function makeWatchedObject(obj) {
    var cache = new Map();
    var on = function (change, callback) {
        cache.set(typeof change === "string" ? change.replace("Changed", "") : change, callback);
    };
    return new Proxy(__assign(__assign({}, obj), { on: on }), {
        set: function (target, p, newValue) {
            var _a;
            (_a = cache.get(p)) === null || _a === void 0 ? void 0 : _a(newValue);
            return true;
        },
    });
}
var person = makeWatchedObject({
    firstName: "Saoirse",
    lastName: "Ronan",
    age: 26,
});
person.on("firstNameChanged", function () {
    console.log("hello");
});
