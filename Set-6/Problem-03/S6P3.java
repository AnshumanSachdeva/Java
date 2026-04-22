class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            System.out.println("\nSleep started\n");
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("error occured: " + e);
            }
            System.out.println("\nSleep ended\n");
        }
    }
}


public class S6P3 {
    public static void main(String[] args) {
        A threadA = new A();
        threadA.start();
        System.out.println("Thread A started: ");
    }
}
