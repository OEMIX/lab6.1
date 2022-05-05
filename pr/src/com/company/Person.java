package com.company;

public class Person {
    int lvl; // уровень
    double height;  // висота персонажа
    int power; // сила
    int dexterity; //ловкість
    String name; // імя
    int Fatigue ; //втома

    public Person(double height, int power, int dexterity,String name,int lvl,int Fatigue ){
        this.height=height;
        this.power=power;
        this.dexterity=dexterity;
        this.name=name;
        this.lvl=lvl;
        this.Fatigue=Fatigue;
    }
    void Training_lvl(){
        lvl = lvl + 1 ;
        System.out.println("Після тренировки уровень піднявся до : "+lvl);
    }
    int Trainig_dexterity(){
        Fatigue = Fatigue+30;
        return Fatigue;
    }

}
