package com.company;

public class HP {
    double Regeneration; // регенерація
    double amount; // об'єм
    double Endurance; // Витривалість

    public HP (double Regeneration,double amount,int Endurance){
        this.Regeneration=Regeneration;
        this.amount=amount;
        this.Endurance=Endurance;
    }
    void Training_Endurance(){
        Endurance = Endurance + 5;
        System.out.println(" Витривалість: "+Endurance);
    }
    int Trainihg_amount_HP(){
        amount  = amount - 700;
        return 100;
    }

}
