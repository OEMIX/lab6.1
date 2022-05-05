package com.company;

public class Mana {
    double Regeneration; // регенерація
    double amount; // об'єм
    int Intelligence; // Інтелект

    public Mana (double Regeneration,double amount,int Intelligence){
        this.Regeneration=Regeneration;
        this.amount=amount;
        this.Intelligence=Intelligence;
    }
    void Training_Intelligence(){
        Intelligence = Intelligence + 5;
        System.out.println(" інтелект: "+Intelligence);
    }
    int Trainihg_amount_Mana(){
        amount  = amount - 350;
        return 50 ;
    }
}
