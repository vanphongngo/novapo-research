"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
function observable(target, key) {
    console.log("target: ", target);
    console.log("key:", key);
    console.log("value:", target[key]);
    target[key] = "i am novapo";
}
class MyClass {
    constructor() {
        this.name = "hello";
    }
}
__decorate([
    observable
], MyClass.prototype, "name", void 0);
function testDecorator() {
    const a = new MyClass();
    console.log(a.name);
}
exports.default = testDecorator;
