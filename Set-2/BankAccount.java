public class BankAccount {
    String accHolderName = "";
    int balance;

    BankAccount(String n, int b) {
        accHolderName = n;
        balance = b;

    }

    BankAccount() {
        this("Unknown", 0);
    }

    void depositMoney(int m) {
        balance += m;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Anshuman", 100);
        b1.depositMoney(200);
        b1.display();
    }
}
