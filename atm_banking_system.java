package PROJECT;

import java.util.Scanner;

public class atm_banking_system {

    static String name;
    static int accountNumber;
    static int pin;
    static double balance;
    static boolean isLoggedIn = false;
    static boolean accountExists = false;
    static Scanner sc = new Scanner(System.in);
    static int accountCounter = 1000;

    public static void main(String[] args) {
        onStart();
    }

    static void onStart() {
        while (true) {

            System.out.println("JAVA BANK PVT LTD");
            System.out.println("  1. CREATE ACCOUNT");
            System.out.println("  2. LOGIN");
            System.out.println("  3. EXIT");

            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;

                case 2:
                    if (login() == true) {
                        bankMenu();
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Exit Successful");
                    return;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        }

    }

    static void createAccount() {

        System.out.print("Enter your Name: \n");
        name = sc.next();

        accountNumber = accountCounter;
        accountCounter++;

        System.out.println("Your Account Number: " + accountNumber);

        while (true) {
            System.out.println("Set your PIN of 4- Digits: ");
            pin = sc.nextInt();
            // int inputPin=0;
            if (pin >= 1000 && pin <= 9999) {
                break;
            } else {
                System.out.println("PIN value exceeded more than 4- Digits");
            }

        }

        System.out.println("Enter your first deposit amount: ");
        balance = sc.nextDouble();

        accountExists = true;

        System.out.println("Account Created Successfully.");
    }

    static boolean login() {

        if (!accountExists) {
            System.out.println("No account found");
            return false;
        }

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter Account Number: ");
            int inputAccount = sc.nextInt();

            System.out.println("Enter PIN: ");
            int inputPin = sc.nextInt();

            if (inputAccount == accountNumber && inputPin == pin) {
                System.out.println("Login Successful");
                isLoggedIn = true;
                return true;
            } else {
                if (i < 3) {
                    System.out.println("Invalid Credentials");
                    System.out.println("Attempts Available: " + (3 - i));
                } else {
                    System.out.println("Invalid Credentials");
                    System.out.println("Maximum login attempts reached.");
                }
            }

        }

        return false;

    }

    static void bankMenu() {
        isLoggedIn = true;
        while (isLoggedIn) {

            System.out.println("BANK MENU");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. ACCOUNT DETAILS");
            System.out.println("5. LOGOUT");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    accountDetails();
                    break;

                case 5:
                    logout();
                    break;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        }
    }

    static void checkBalance() {
        System.out.println("Current Balance: " + balance);

    }

    static void deposit() {
        System.out.println("Enter Amount to Deposit: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        balance += amount;

        System.out.println("Deposit Successful");
        System.out.println("Updated Balance: " + balance);
    }

    static void withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }

        balance -= amount;

        System.out.println("Withdraw Successful");
        System.out.println("Updated Balance: " + balance);

    }

    static void accountDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account PIN: Nahi dikha sakta, Yaad karlena");
        System.out.println("Updated Account Balance: " + balance);
    }

    static void logout() {
        isLoggedIn = false;
        System.out.println("Logged out Successfully");
    }
}
