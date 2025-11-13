public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200000);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.withdraw(400000);
        System.out.println("Balance after attempting over-withdrawal: " + account.getBalance());
    }
    
}
