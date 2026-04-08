class BankAccount {
    private float balance;

    BankAccount(float b) {
        balance = b;
    }

    protected void withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class User extends BankAccount {
    User(float b) {
        super(b);
    }

    void makeWithdrawal(float amount) {
        withdraw(amount);
    }
}

class premiumAccount extends User {
    premiumAccount(float b) {
        super(b);
    }
}

public class S4P2 {
    public static void main(String[] args) {
        User user = new User(1000);
        user.checkBalance();
        user.makeWithdrawal(200);
        user.checkBalance();

        premiumAccount premiumUser = new premiumAccount(2000);
        premiumUser.checkBalance();
    }
}
