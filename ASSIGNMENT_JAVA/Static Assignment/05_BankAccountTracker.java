

public class BankAccount {
    
    private int bankAccount;
    private static int startAccount = 10001;
    private static int totalAccount = 0;

    public BankAccount()
    {   
        this.bankAccount = startAccount;
        startAccount++;
        totalAccount++;
    }

    static void showTotalAccount()
    {
        System.out.println("Total Accounts are: " + totalAccount);
    }
    
    public static void main(String[] args) {
        
        BankAccount bnk1 = new BankAccount();
        System.out.println("First account: " + bnk1.bankAccount);
        BankAccount bnk2 = new BankAccount();
        BankAccount bnk3 = new BankAccount();
        BankAccount bnk4 = new BankAccount();
        
        showTotalAccount();
    }
}
