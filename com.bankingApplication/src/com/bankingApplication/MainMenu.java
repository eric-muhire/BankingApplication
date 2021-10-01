import java.util.Scanner;


public class MainMenu {
    BankingApplication bank= new BankingApplication();

    void showMenu () {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        S.o("Welcome " + bank.customerName);
    }

}
