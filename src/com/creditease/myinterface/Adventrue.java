package com.creditease.myinterface;

interface CanFight{
    void fight();
    static void fl(){
        System.out.println("canFight");
    }
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}
class ActionCharacter{
    public void fight(){
        System.out.println("ActionCharacter fight");
    }
}

class Hero extends  ActionCharacter implements CanFight,CanFly,CanSwim{


    @Override
    public void swim() {
        System.out.println("hero swim");
    }

    @Override
    public void fly() {
        System.out.println("hero fly");
    }
}

public class Adventrue {
    public static void t(CanFight x){
        x.fight();
        System.out.println(x);
        CanFight.fl();
    }
    public static void u(CanSwim x){
        x.swim();
        System.out.println(x);
    }
    public static void v(CanFly x){
        x.fly();
        System.out.println(x);
    }
    public static void w(ActionCharacter x){
        x.fight();
        System.out.println(x);
    }

    public static void main(String[] args) {
        Hero h=new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
