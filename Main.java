public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        savingsAccount savings = new savingsAccount("SA123","Bokachan",5000,2.5);

        currentAccount current = new currentAccount("CA453","Balika",100000,2000);

        bank.addAccounts(savings);
        bank.addAccounts(current);

        savings.deposit(1000);
        current.withdraw(1500);

        savings.addInterest();

        bank.transferFunds("SA123", "CA453", 300);
        savings.checkBalance();
        current.checkBalance();
    }
}
