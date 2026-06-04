package Day06;

public class BankAccount {

    private String owner;
    private double balance;

    BankAccount(String owner, double initialBalance){
        this.owner = owner;
        if(initialBalance >= 0)
            this.balance = initialBalance;
        else
            throw new IllegalArgumentException("Balance cannot be negative!");
    }

    public void deposit(double amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Amount must be positive!");
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Amount must be positive!");
        if(amount > balance)
            throw new IllegalArgumentException("Insufficient funds!");
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }

    public double getBalance(){ return balance; }
    public String getOwner()  { return owner; }

    public void display(){
        System.out.println("Owner: " + owner + " | Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Kavya", 1000);
        BankAccount acc2 = new BankAccount("Raj", 500);
        BankAccount acc3 = new BankAccount("Priya", 2000);

        System.out.println("-- Account 1 --");
        acc1.display();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.display();

        System.out.println("\n-- Account 2 --");
        acc2.display();
        acc2.deposit(1000);
        acc2.withdraw(300);
        acc2.display();

        System.out.println("\n-- Account 3 --");
        acc3.display();

        try{
            acc3.withdraw(5000);
        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            acc3.deposit(-100);
        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}