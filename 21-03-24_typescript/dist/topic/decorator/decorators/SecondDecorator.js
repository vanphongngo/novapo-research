"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
Object.defineProperty(exports, "__esModule", { value: true });
function f(key) {
    console.log("evaluate: ", key);
    return function () {
        console.log("call: ", key);
    };
}
let C = class C {
    static method(foo) { }
    constructor(foo) { }
    method(foo) { }
};
__decorate([
    f("Instance Method"),
    __param(0, f("Instance Method Parameter"))
], C.prototype, "method", null);
__decorate([
    f("Instance Property")
], C.prototype, "prop", void 0);
__decorate([
    f("Static Property")
], C, "prop", void 0);
__decorate([
    f("Static Method"),
    __param(0, f("Static Method Parameter"))
], C, "method", null);
C = __decorate([
    f("Class Decorator"),
    __param(0, f("Constructor Parameter"))
], C);
function execute02() {
    let a = new C("class C");
    let b = new C("class B");
}
exports.default = execute02;
