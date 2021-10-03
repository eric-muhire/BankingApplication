package com.bankingApplication;
import java.util.Scanner;

public class MainMenu {
    BankAccount account = new BankAccount();

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        S.o("Welcome " + account.getCustomerName());
        S.o("Your ID id " + account.getCustotmerId());
        S.o("\n");
        S.o("A.Check Balance");
        S.o("C.Withdraw");
        S.o("d.previous transaction");
        S.o("E.Exit");
        do {
            S.o(":::::::::::::::::::::::::::::::");
            S.o("Enter an option");
            S.o(":::::::::::::::::::::::::::::::");
            option = scanner.next().charAt(0);
            S.o("\n");

            switch (option) {
                case 'A':
                    S.o("Balance = " + account.getBalance());
                    S.o(":::::::::::::::::::::::::");
                    S.o("\n");
                    break;
                case 'B':
                    S.o("Enter amount to deposit");
                    int amount = scanner.nextInt();
                    account.deposit(amount);
                    break;
                case 'C':
                    S.o("Enter an amount o withdraw");

                    int amount2 = scanner.nextInt();
                    account.withdraw(amount2);
                    break;

                case 'D':
                    S.o(":::::::::::::::::::::");
                    account.getPreviousTransaction();
                    S.o(":::::::::::::::::::::");
                    S.o("\n");
                    break;
                default:
                    S.o("invalid option! please try again");
                    break;
            }
        }
                while (option != 'E');
                    S.o("Thank you for using our services");
                }
            }





