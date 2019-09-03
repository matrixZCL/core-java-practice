package oop2;

public class TestSuper {
    public static void main(String[] args){
        new B(10);
    }
}



class A{
    public A(){
        System.out.println("A()");
    }

    public A(int n){
        System.out.println("A(int)");
    }
}

class B extends A{

    public B(){

        System.out.println("B()");
    }
    public B(int n){
        this();//指定子类调用父类哪个构造方法，默认super（）；
        System.out.println("B(int)");
    }
}