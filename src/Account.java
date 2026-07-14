public class Account {
    int account_no;
    private float balance;
    Account(int account_no) {
        this.account_no = account_no;
    }
    void deposit(float balance) {
        this.balance += balance;
        System.out.println("Deposited $" + balance);
    }
    void withdraw(float balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            System.out.println("Withdraw $" + balance);
        }
    }
    void checkBalance() {
            System.out.println("Your balance is $" + this.balance);
    }
}
