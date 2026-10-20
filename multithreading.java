class multithreading extends Thread { 
    @Override 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName() + " : " + i); 
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException e) { 
                Thread.currentThread().interrupt(); 
            } 
        } 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        multithreading t1 = new multithreading(); // Fixed typo here
        multithreading t2 = new multithreading(); 
        t1.start(); 
        t2.start(); 
    } 
}