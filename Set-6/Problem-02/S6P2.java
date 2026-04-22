class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}
class B implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}
class C extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread C: " + i);
        }
    }
}




public class S6P2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        threadA.start();
        System.out.println("Thread A started: ");
        threadB.start();
        System.out.println("Thread B started: ");
        c.start();
        System.out.println("Thread C started: ");
    }
}
