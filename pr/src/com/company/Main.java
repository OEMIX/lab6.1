package com.company;

public class Main {

    public static void main(String[] args) {

        Mana Mana= new Mana(0.5,400,5);
        HP HP = new HP(2.5,800,5);
        Person Person = new Person(1.87,5,5,"Axe",1,0);

        System.out.println("Ім`я героя : "+ Person.name+" , lvl: "+ Person.lvl+" , Висота :"+ Person.height+", статус : Сила -"+ Person.power+" , ловкість-"+ Person.dexterity);
        System.out.println("Мана: об'єм-"+ Mana.amount+" , регенерація-"+ Mana.Regeneration+" , інтелект-"+ Mana.Intelligence);
        System.out.println("Здоров'я : об'єм-"+HP.amount+" , регенерація-"+ HP.Regeneration+" , Витривалість-"+ HP.Endurance);
        System.out.println();

        Person.Training_lvl();
        Mana.Training_Intelligence();
        HP.Training_Endurance();

        System.out.println("Втома піднялась до : "+Person.Trainig_dexterity());
        System.out.println("Здоров'я впало до :"+HP.Trainihg_amount_HP());
        System.out.println("Мана впала до : "+Mana.Trainihg_amount_Mana());


    }

}
