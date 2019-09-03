package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
//        int[][] a=new int[3][4];
////        System.out.println(a.length);//行数
////        System.out.println(a[0].length);//每行的个数
////        int[] b=new int[]{1,2,3};
////        int[]c={1,2,3};
//
//        double[] exam={1,22,12.5};
//        double result=0;
//        for(int i=0;i<exam.length;i++){
//            result+=exam[i];
//
//        }
//
//        System.out.println(result);
//        System.out.println(result/exam.length);

//        int[] a={1,2,3,4,5};
//        int[]b= Arrays.copyOf(a,a.length*2);
//        System.out.println(b.length);
//        System.out.println(a.length);
//        a=b;
//        System.out.println(a.length);
//        for(int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

//        int[][]a=new int[][]{{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
////        int[][]b=new int[3][2];
////        b[0]=new int[5];
////        b[1]=new int[6];
////        for(int i=0;i<b.length;i++){
////            for(int j=0;i<b[0].length;j++){
////                System.out.println(b[i][j]);
////            }
////        }
//        for (int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.println(a[i][j]);
//            }
//        }

//        int[]a={1,2,3,4,5};
//        int[]b=a;
//        b[0]=10;
//        System.out.println(a[0]);//10

//        int c=1;
//        int d=c;
//        d=10;
//        System.out.println(c);
//
//        int[]a={1,2,3,4,5};
//        chang(a);
//        System.out.println(a[0]);
//
//        int c=1;
//        chang(c);
//        System.out.println(c);//1
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));


    }
//    static  void chang(int[]a){
//        a[0]=10;
//    }
//    static void chang(int c){
//        c=10;

//    }
    public static int add(int...a){
        int result=0;
        for(int i=0;i<a.length;i++){
            result+=i;
        }
        return result;
    }
}
