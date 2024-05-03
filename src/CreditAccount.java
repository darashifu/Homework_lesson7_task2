public class CreditAccount extends Account{
    public CreditAccount(int balance) {
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
            System.out.println("From Credit Account transfer" + amount + " to " + account.getClass().getName());}
        else {
            System.out.println("Error, have not money");}
    }

    @Override
    public void addMoney(int amount) {
        if (amount < 0){
        balance += amount;
        System.out.println("To account added money" + amount);}
        else {
            System.out.println("Error");}
    }
}
