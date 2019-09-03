package interfacepc;

public class TestMultiInher {
    public static void main(String[] args){
        Animal0 a=new Snoopy();
        Dog0 d=(Dog0) a;
        Person p=(Person)d;
    }
}

class Animal0{}
class Dog0 extends Animal0{}

interface Person{}

class Snoopy extends Dog0 implements Person{}
