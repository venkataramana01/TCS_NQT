public class A1 {
    public static void main(String[] args) {
        Account account = new Account(12345678);
        account.deposit(500);
//        account.withdraw(500);
        System.out.println(account.account_no);
//        account.withdraw(500);
        account.checkBalance();
    }
}
