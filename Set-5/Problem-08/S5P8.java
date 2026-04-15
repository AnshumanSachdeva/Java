// banking withdrawal exception
class Bank extends Exception {
    int balance;

    Bank(int b) {
        balance = b;
    }

    void withdraw(int amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient funds. Cannot withdraw.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class S5P8 {
    public static void main(String[] args) {
        Bank acc1 = new Bank(1000);
        acc1.withdraw(500); 
        acc1.withdraw(600); 
    }
}
