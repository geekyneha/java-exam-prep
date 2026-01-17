package module3.threads;

// Thread creation by implementing Runnable interface

// In this approach, a class implements the Runnable interface and provides the implementation for the run() method.
// now question may arise why we need to implement Runnable interface when we can extend Thread class directly.
// The answer is that Java does not support multiple inheritance, so if a class extends the Thread class, it cannot extend any other class. 
// By implementing the Runnable interface, a class can still extend another class while also being able to run as a thread.
// The Thread class and Runnable interafce are both part of the java.lang package. The Thread class provides the necessary methods to create and manage threads, while the Runnable interface defines a single method, run(), that contains the code to be executed by the thread.

public class MyThread2 implements Runnable{

    @Override

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }

    public static void main(String args[]){

        MyThread2 myThread2 = new MyThread2();
        Thread t1= new Thread(myThread2);
        t1.start();

        for(int i=0 ; i<10; i++){
            System.out.println("Main thread: " + Thread.currentThread().getName());
        }

    }
    
}
