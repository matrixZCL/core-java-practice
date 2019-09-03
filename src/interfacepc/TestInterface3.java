package interfacepc;

public class TestInterface3 {
}

interface Const{
    int A=10;
    double b=2.5;
}

interface Empty{}

class Animal{}

interface Pet{}
class Dog extends Animal implements Pet{}
class Cat extends Animal implements Pet{}
class Tiger extends Animal{}
class Fish extends Animal implements Pet{}
class Bear extends Animal{}

