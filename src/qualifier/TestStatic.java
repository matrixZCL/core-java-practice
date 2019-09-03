package qualifier;

public class TestStatic {
    public static void main(String[] args){
        ClassA a1=new ClassA();
        ClassA a2=new ClassA();
        a1.m++;
        a1.n++;
        System.out.println(a2.m);
        System.out.println(a2.n);

        Super u=new Sub();
        u.m();//根据引用类型调用相应的方法
    }
}

class ClassA{
    int m=10;
    static int n=20;//只初始化一次，所有对象共享
    public static void print(){
        //System.out.println(m);静态方法只能访问静态成员
        System.out.println(n);
        //ma(); 无法调用
        mb();

    }
    public void ma(){

    }
    public static void mb(){

    }
}

class Super{
    public static void m(){
        System.out.println("super");
    }
}

class Sub extends Super{
    public static void m(){
        System.out.println("sub");
    }
}

