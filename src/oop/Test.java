package oop;

public class Test {
    public static void main(String[]args){
        int a=10;
        int b=a;
        b++;
        System.out.println(a);//10

        Student s1=new Student();
        System.out.println(s1.toString());
        Student s2=s1;
        s2.age++;
        System.out.println(s1.age);

        changeAge(s2);
        System.out.println(s1.age);

    }

    public static void changeAge(Student s){
        s.age++;
    }

}
