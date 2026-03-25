class Account {
    int accNo, balance;
    Account(int a, int b){
        accNo = a;
        balance = b;
    }
}
class SavingsAccount extends Account{
    int interestRate;
    SavingsAccount(int a, int b, int r){
        super(a, b);
        interestRate = r;
    }
    void displayInterest(){
        float x = (balance * interestRate)/100;
        System.out.println("Interest: "+ x);
    }
}
public class S3P5 {
     public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(101, 1900, 2);
        s1.displayInterest();
    }
}
