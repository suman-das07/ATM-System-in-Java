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
                    login();
                    if (login()==true){
                        bankMenu();
                    }
                    break;

                case 3:

                    break;

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

        System.out.println("Set your PIN of 4- Digits: ");
        pin = sc.nextInt();

        System.out.println("Enter your first deposit amount: ");
        balance = sc.nextDouble();

        accountExists = true;

        System.out.println("Account Created Successfully.");

    }

    static boolean login(){
        
        if(!accountExists){
           return false;
           }
        System.out.println("Enter Account Number: ");
        int inputAccount=sc.nextInt();

        System.out.println("Enter PIN: ");
        int inputPin=sc.nextInt();

        if(inputAccount==accountNumber && inputPin==pin){
            System.out.println("Login Successful");
            isLoggedIn=true;
            return true;
        }
        else{
            System.out.println("Invalid Credentials");
        }
        
        return false;

    }
    
    static void bankMenu(){
        isLoggedIn= true;
        while (isLoggedIn){

            System.out.println("BANK MENU");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. LOGOUT");

            int choice= sc.nextInt();

            switch (choice) {
                case 1:
                    
                    break;

                case 2:

                break;
            
                default:
                    break;
            }


        }
    }





    static void logout(){
        isLoggedIn=false;
        System.out.println("Logged out Successfully");
    }
}

