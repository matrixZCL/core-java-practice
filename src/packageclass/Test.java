package packageclass;

public class Test {
    public static void main(String[] args){
        Animal a1=new Dog();
        Animal a2=new Cat();
//        if((a1 instanceof Dog)&&(a2 instanceof Dog)||(a1 instanceof Cat)&&(a2 instanceof Cat)){
//            System.out.println("tonglei");
//        }
//        else{
//            System.out.println("bus");
//        }
//        if(a1.getClass()==a2.getClass()){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("bus");
//        }
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}

class Animal{}
class  Dog extends Animal{

}
class Cat extends Animal{}