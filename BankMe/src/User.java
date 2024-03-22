public class User {
    String username;
    int balance;
    Account account;

    int getBalance(){
       return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
