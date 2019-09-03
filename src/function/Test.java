package function;

public class Test {
    public static void main(String[] at){

        for(int abc=100;abc<999;abc++){
            int a=abc/100;
            int b=abc%100/10;
            int c=abc%10;
            int result=fact(a)+fact(b)+fact(c);
            if(result==abc)
                System.out.println(abc);
        }

    }


    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result *=i;
        }
        return  result;
    }


    public static void transfer(int n,char from,char to,char temp){

    }
}
