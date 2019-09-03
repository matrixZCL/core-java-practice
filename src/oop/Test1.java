package oop;

public class Test1 {
    public static void main(String[] args){
        MyClass mc=new MyClass();
        System.out.println(mc.a);
        //mc.m1();
        mc.m2();
    }
}

class MyClass{
    int a=10;
    int b=20;
    public MyClass(){};

    public MyClass(int i){
        this();
    }
    public MyClass(String s){
        this(10);
    }

    public void m1(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
    }
    public void m2(){
        System.out.println(this.a);
        System.out.println(this.b);
        this.m1();
    }

}
