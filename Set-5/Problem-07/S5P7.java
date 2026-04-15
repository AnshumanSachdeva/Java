// throw exception for invalid age.

class Voting extends Exception {
    int age;

    Voting(int a) {
        try {
            if (a < 18) {
                throw new Exception("Invalid age. Not eligible");
            }
            age = a;
            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

public class S5P7 {
    public static void main(String[] args) {
        Voting v1 = new Voting(20);
        Voting v2 = new Voting(15);
    }
}
