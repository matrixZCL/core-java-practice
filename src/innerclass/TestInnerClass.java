package innerclass;

import sun.jvm.hotspot.memory.LoaderConstraintEntry;

public class TestInnerClass {
    public static void main(String[] args){
//        Outer o1=new Outer(10);
//        Outer.MemberInner in2=o1.new MemberInner();
//        in2.method();
        Outer.StaticInner staticInner=new Outer.StaticInner();
        staticInner.method();
        Outer out=new Outer(0);
        out.m();
    }
}


class Outer{
    private int a;
    private static int b=20;

    public Outer(int a) {
        this.a = a;
    }
    public void m(){
        final int x=50;
        class LocalInner{
            private int o=30;
            public void method(){
                System.out.println(o);
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
            }
        }
        LocalInner in=new LocalInner();
        in.method();
    }
    class MemberInner{
        private int a=30;
        public void method(){
            int a=40;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }

    }

    static class StaticInner{
        private int x=10;
        public void method(){
            System.out.println(x);
            System.out.println(b);
        }

    }

}