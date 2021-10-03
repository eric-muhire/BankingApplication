package com.bankingApplication;

public class BankingApplication{

    public static void main(String[] args) {
        MainMenu menu= new MainMenu();
        BankAccount bank=new BankAccount("Eric",102);
        menu.showMenu();

    }

}