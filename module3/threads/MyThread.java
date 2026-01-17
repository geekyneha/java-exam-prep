package module3.threads;

// Thread is a lightweight process that is the smallest unit of CPU execution. It is used to perform multiple tasks simultaneously within a single process. for example downloading a file while playing music. Anoter example is a web browser that opens multiple tabs, each tab runs in its own thread. 
// For example, in a game application, one car can be considered as a thread. Each car runs independently and performs its own tasks, such as moving forward, turning, and stopping. Multiple cars can run simultaneously in the game, each represented by its own thread.

// The execution of a thread can be managed using various methods provided by the Thread class in Java. Some commonly used methods include:  
// 1. start(): This method is used to start the execution of a thread. It invokes the run() method of the thread.
//2. run(): This method contains the code that defines the behavior of the thread. It is called when the thread is started.
//3. sleep(): This method is used to pause the execution of a thread for a specified period of time. 
//4. join(): This method is used to wait for a thread to complete its execution before proceeding with the next thread.
//5. yield(): This method is used to pause the execution of the current thread and allow other threads of the same priority to execute.
// There are two ways to create a thread in Java: 

// 1. By extending the Thread class
// 2. By implementing the Runnable interface


// Thread creation by extending Thread class
public class MyThread extends Thread {
     
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
        }
        
    }
    public static void main(String[] args) {

        MyThread t1= new MyThread();
        t1.start();

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
        }


        
    }

    
    
}
