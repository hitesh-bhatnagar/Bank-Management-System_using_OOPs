public class currentAccount extends Account{
    protected double Threshold = 100000;

    public currentAccount(String accountNumber, String accountHolder, double balance, double Threshold){
        super(accountNumber, accountHolder, balance);
        this.Threshold = Threshold;
    }

    @Override
    public void withdraw(double amount){
        this.balance -= amount;
        if(balance <= 0){
            this.Threshold -= amount;
            this.balance = -amount;
        }else this.balance -= amount;
    }
}