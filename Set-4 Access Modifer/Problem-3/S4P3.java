class Atm {
    String name;
    int pin;
    int balance;

    Atm(String name, int pin, int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Pin: " + pin);
        System.out.println("Balance: " + balance);
    }
    void withdraw(int am){
        try {
            if (am > balance) {
                throw new Exception("Insufficient funds");
            }
            else if (am < 0) {
                throw new Exception("Invalid amount");
            } else {
                balance -= am;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction complete");
        }
    }
}

public class S4P3 {
    public static void main(String[] args) {
        Atm atm = new Atm("ABC", 1234, 1000);
        atm.display();
        atm.withdraw(500);
        atm.withdraw(600);
        atm.withdraw(-100);
    }
}
