public class SavingsAccount extends Account {
    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Error, SavingAccount not pay");
    }

    @Override
    public void transfer(Account account, int amount) {
        if ( balance > amount ){
        balance -= amount;
        account.addMoney(amount);
        System.out.println("From Saving Account transfer " + amount + " to " + account.getClass().getName());}
        else {
            System.out.println("Error, have not money ");
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("To account added money" + amount);
    }
}
