package Bank;

import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        String personName;
        String typeOfAcc;
        String bankName;
        int AccNumber;
        double balance;
        BankAccount ba;
        int choice = 5;
        double amt;
        int scanAcc;


        Scanner in = new Scanner(System.in);

        System.out.println("Creating New Account \nList of bank name available : \n1.AAA interest rate 5% \n2.BBB interest rate 4.97%");

        while (true){
        System.out.println("Type a bank name: ");
        bankName = in.nextLine();

            if(bankName.equals("AAA")){
                System.out.println("Your interest rate 5%.");
                break;
            } else if (bankName.equals("BBB")) {
                System.out.println("Your interest rate 4.97%.");
                break;
            }
            System.out.println("Please type a correct bank name");
        }

        System.out.println("Enter name: ");
        personName = in.nextLine();
        System.out.println("Account Number: ");
        AccNumber = in.nextInt();
        in.nextLine();

        while (true) {
            System.out.println("There are 2 type of account 'Salary' and 'Saving'.\nAccount Type: ");
            typeOfAcc = in.nextLine();

            if(typeOfAcc.equalsIgnoreCase("Salary")){
                break;
            } else if (typeOfAcc.equalsIgnoreCase("Saving")) {
                break;
            }
            System.out.println("Please type a correct type of account");

        }


        System.out.println("Initial Deposit in $: ");
        balance = in.nextDouble();



        if(balance < 10){
            System.out.println("Sorry, Your account cannot be create");
            System.out.println("Minimun of 10$ should be maintain");
            System.exit(0);
        }

        ba = new BankAccount(AccNumber, personName, typeOfAcc, balance, bankName);



    do {

        System.out.println("\nBanking Menu");
        System.out.println("\n 1. Deposit \n 2. Withdraw \n 3. Show Details \n 4. Search Account \n 5. Exit Program");
        System.out.print("Enter your choice : ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount: ");
                amt = in.nextDouble();
                balance = ba.Deposit(amt);
                System.out.println("Current balance is: " + balance + "$");
                break;

            case 2:
                System.out.println("Enter the amount:");
                amt = in.nextDouble();
                balance = ba.Withdraw(amt);
                System.out.println("Current balance is: " + balance + "$");
                break;

            case 3:
                ba.DisplayDetails();
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            case 4:
                System.out.println("Searching account number:");
                scanAcc = in.nextInt();
                if(scanAcc == AccNumber){
                    ba.DisplayDetails();
                }else{
                    System.out.println("Account not found.");
                }
            default:
                System.out.println("\nPlease enter a number between 1 and 5");

        }

        }while (choice != 5);
    }
}
