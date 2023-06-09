import java.util.Scanner;

import static java.lang.System.*;

public class ScannerTest {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("XYZ","MA1234");
        obj1.showMenu();



    }


}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }


    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }

    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            out.println("Withdrawn = " + Math.abs(previousTransaction));
        } else {
            out.println("No transaction occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        out.println("Welcome " + customerName);
        out.println("Your ID is " + customerId);
        out.println("\n");
        out.println("A. CheckBalance");
        out.println("B. Deposit");
        out.println("C. Withdraw");
        out.println("D. Previous Transaction");
        out.println("E. Exit");

        do {
            out.println("======================================");
            out.println("Enter an option ");
            option = scanner.next().charAt(0);
            out.println("\n");


            switch (option) {

                case 'A':
                    out.println("--------------------------------------");
                    out.println("Balance = " + balance);
                    out.println("--------------------------------------");
                    out.println("\n");

                case 'B':
                    out.println("---------------------------------------");
                    out.println("Enter an amount to deposit: ");
                    out.println("---------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    out.println("\n");
                    break;

                case 'C':
                    out.println("-----------------------------------------");
                    out.println("Enter an amount to withdraw: ");
                    out.println("-----------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    out.println("\n");
                    break;

                case 'D':
                    out.println("-----------------------------------------");
                    getPreviousTransaction();
                    out.println("-----------------------------------------");
                    out.println("\n");
                    break;

                case 'E':
                    out.println("******************************************");
                    break;

                default:
                    out.println("Invalid option!!. Please enter again: ");
                    break;

            }


        } while (option != 'E');
        out.println("Thank you for using our service. ");

    }
}