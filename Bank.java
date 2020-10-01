public class Bank{

    //Instance Variables
    private double balance;
    private double interest;

    public Bank(){
        //Default Values
    }

    //Constructor
    public Bank(double pBalance){
        this.balance = pBalance;
    }

    //Setter Method 
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    //Check Balance Getter Method
    public double getBalance(){
        return this.balance;
    }

    //Deposit Setter Method
    public void depositMoney(double amountOfDeposit){
        this.balance += amountOfDeposit;
    }

    //Withdraw Setter Method
    public void withdrawMoney(double amountOfWithdrawl){
        this.balance -= amountOfWithdrawl;
    }

    public double calcInterest(){
        return this.balance * this.interest;
    }



    
}