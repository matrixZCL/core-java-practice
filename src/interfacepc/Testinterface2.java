package interfacepc;

import oop2.pa.B;

public class Testinterface2 {
    public static void  main(String[] args){
        RedBulb b=new RedBulb();
        b.shine();
    }
}

interface Bulb{
    void shine();
}

class RedBulb implements Bulb{

    @Override
    public void shine() {
        System.out.println("red");
    }
}

class YellowBulb implements Bulb{

    @Override
    public void shine() {
        System.out.println("yellow");
    }
}