package oop2;

public class TestPoly {
    public static void main(String[] args){
        Animal0 a;
        a=new Dog0();
        a.eat();
    }
}

abstract class Animal0{
    public abstract void eat();

}

class Dog0 extends Animal0{

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}