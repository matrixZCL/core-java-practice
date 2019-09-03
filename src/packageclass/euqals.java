package packageclass;

public class euqals {
    public static void main(String[] args){
        int a=10;
        int b=10;
        System.out.println(a==b);

        Ironman c=new Ironman(1,"tom");
        Ironman d=new Ironman(1,"tom");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        Integer i=10;
        String s=String.valueOf(10);
        s=i+"1";
        System.out.println(s);
        int j=Integer.parseInt(s);
        System.out.println(j+100);

    }

}
