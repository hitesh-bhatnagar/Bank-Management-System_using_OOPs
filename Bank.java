import java.util.ArrayList;

public class Bank{
    private final ArrayList<Account> list = new ArrayList<>();


    public void addAccounts(Account acc){
        list.add(acc);
        System.out.println("Account added " + acc.getAccountNumber());
    }

    public Account findAccounts(String accountNumber){
        for(Account i : list){
            if(i.getAccountNumber().equals(accountNumber)) return i;
        }
        System.out.println("Account not found.");
        return null;
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount){
        Account fromAccount = findAccounts(fromAccountNumber);
        Account toAccount = findAccounts(toAccountNumber);

        if(fromAccount != null && toAccount != null){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        }
    }
}