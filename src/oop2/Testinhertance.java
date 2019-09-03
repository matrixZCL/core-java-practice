package oop2;

public class Testinhertance {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
    }
}


class Animal{
    public int age;
    public void eat(){

        System.out.println("Animal eat");
    }
    public void sleep(){

    }
}
class Dog extends Animal{
    private int name;
    public void eat(){
        System.out.println("dogeat");
    }
    public void shout(){
        System.out.println("wangwang");
    }
    public void print(){
        System.out.println(age);
    }
}
//class cat{
//    public void print(){
//        System.out.println(age);
//    }
//}



