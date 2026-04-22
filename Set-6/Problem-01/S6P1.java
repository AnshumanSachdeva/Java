class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

public class S6P1 {

    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        System.out.println("Thread A started: ");
        threadB.start();
        System.out.println("Thread B started: ");

    }
}