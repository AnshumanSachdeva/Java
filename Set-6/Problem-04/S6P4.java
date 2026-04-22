class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class S6P4 {
    public static void main(String[] args) {
        
        A threadA = new A();
        A threadB = new A();

        try {
            threadA.start();
            threadA.join();  
            System.out.println("Main thread resumes after Thread A");
            
            threadB.start();
            threadB.join();  
            System.out.println("Main thread resumes after Thread B");

        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
        
    }
    
}