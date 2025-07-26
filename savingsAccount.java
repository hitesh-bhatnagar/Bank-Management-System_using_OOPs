
public class savingsAccount extends Account{

    private final double interestRate;
    
    public savingsAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    

    public void addInterest(){
        this.balance += interestRate*this.balance/100;
        System.out.println(interestRate + " interest rate has been applied to your balance" + checkBalance());

    }
}
