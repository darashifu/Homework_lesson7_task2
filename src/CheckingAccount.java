public class CheckingAccount extends Account{
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if ( balance >= amount){
            balance -= amount;
            System.out.println("Pay with CheckingAccount" + amount);}
        else{
            System.out.println("Error, have not money");
        }

    }

    @Override
    public void transfer(Account account, int amount) {
        if ( balance > amount ){
            balance -= amount;
            account.addMoney(amount);
            System.out.println("From CheckingAccount transfer" + amount + " to " + account.getClass().getName());}
        else {
            System.out.println("Error, have not money");
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("To account added money" + amount);
    }
}
