package processcontrol;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
//        for(int i=1;i<11;i++){
//            if(i==9) continue;
//            System.out.println(i);
//
//        }

//        for(int i=1;i<11;i++){
//            if(i==9) break;
//            System.out.println(i);
//
//        }

        //testif

//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        if(n<0){
//            System.out.println("fault");
//        }
//        if(n>0&&n<20){
//            System.out.println("teenager");
//        }
//        else{
//            System.out.println("old");
//        }

//        if(true){
//            int a=10;
//            System.out.println(a);
//        }
//        if(true){
//            int a=20;
//            System.out.println(a);
//        }
//        if(true){
//            int i=10;
//        }

//        int i=1;
//        int result=0;
//        do{
//            result+=i;
//            i++;
//        }
//        while (i<2);

        //testswitch
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        switch (a){
            case 0:
            case 1:System.out.println(1);
            break;
            case 2:System.out.println(2);
            break;
            case 3:System.out.println(3);
            break;
            default:System.out.println("others");
        }

        String str="abc";
        switch (str){
            case "abc":System.out.println("heh");
            break;
            case "hello" :System.out.println("xxx");

        }
    }

}
