
public class Account{
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance){
        
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + " amount has been deposited in the account " + checkBalance());
    }

    public void  withdraw(double amount){
        this.balance -= amount;
        if(this.balance > 0) System.out.println(amount + " amount has been withdrawn from the account " + checkBalance());
        else System.out.println("Insufficient balance");
        
    }

    public double checkBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}