import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount(10);
        Account creditAccount = new CreditAccount(20);
        Account checkingAccount = new CheckingAccount(30);

        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Balance: " + creditAccount.getBalance());
        System.out.println("Balance: " + checkingAccount.getBalance());

        creditAccount.addMoney(55);
        checkingAccount.transfer(creditAccount,5);
        savingsAccount.pay(30);

    }
}