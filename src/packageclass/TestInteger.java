package packageclass;

import java.io.InputStream;

public class TestInteger {
    public static void main(String[] args){

        int i=10;
        Integer a=new Integer(i);
        Integer b=Integer.valueOf(i);
        System.out.println(a);
        System.out.println(b);
    }
}
