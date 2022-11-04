package Bank;

public class BankAccount {
    final String name;
    final String accountType;
    final int accountNumber;
    private double balance;
    final String bankName;
    private double interest1 = 0;

    public BankAccount(int accNo, String accName, String accType, double initialAmt, String bName){
        accountNumber = accNo;
        name = accName;
        accountType = accType;
        balance = initialAmt;
        bankName = bName;
    }

    public double Deposit(double amt){
        if (amt > 0){
            balance += amt;
        } else{
            System.out.println("Please enter a positive amount");
        }
        return balance;
    }

    public double Withdraw(double amt){
        if(amt < 0){
        System.out.println("Please enter positive amount");
        }else if (balance - amt < 10) {
            System.out.println("Withdrawal is not permitted as it will result in , minimum balance less than 10$");
        }else{
            balance -= amt;
        }
        return balance;
    }

    public void bankAndRate(){
        if(bankName.equals("AAA")){
            interest1 = 5;
        } else if (bankName.equals("BBB")) {
            interest1 = 4.97;
        }
    }

    public void DisplayDetails(){
        bankAndRate();

        System.out.println("\nAccount No : " + accountNumber +
                "\nUsername : " + name +
                "\nAccount Type : " + accountType +
                "\nBalance : " + balance + "$" +
                "\nBank name: " + bankName +
                "\nInterest rate: " + interest1 + " %" );
    }

    }

