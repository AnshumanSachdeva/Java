class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ThreadA: " + i+" priority: "+getPriority());
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ThreadB: " + i+" priority: "+ getPriority());
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ThreadC: " + i+" priority: "+getPriority());
        }
    }
}

public class S6P5 {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MIN_PRIORITY);

        threadA.start();
        threadB.start();
        threadC.start();

    }
}
