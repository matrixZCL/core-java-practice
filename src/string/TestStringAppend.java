package string;

public class TestStringAppend {
    public static void main(String[] args){
//        String a="aa";
//        String b="bb";
//        b=a+b;
//        System.out.println(b);

        String s="a";
        s+="b";

        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.append("c");
        System.out.println(stringBuilder);
    }
}
