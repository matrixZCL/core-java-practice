package qualifier;

public class TestFinal {
    public static void main(String[] args){
        final int a=10;

    }
}

class A{
    public static final int M=10;
    public final void m(){

    }
}

class B extends A{
    //public void ();
}

//final修饰的方法不能被覆盖，修饰的类不能被继承