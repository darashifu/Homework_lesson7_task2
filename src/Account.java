public abstract class Account {
    public int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    public int getBalance(){
        return balance;
    }
}
