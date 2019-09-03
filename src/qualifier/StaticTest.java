package qualifier;

public class StaticTest {
    public static void main(String[]args){
        new B0();
    }
}

class A0{
    static{
        System.out.println("LoadA");
    }
    public A0(){
        System.out.println("A()");
    }
}

class B0 extends A0{
    static {
        System.out.println("Load b");
    }
    public B0(){
        System.out.println("B()");
    }
}