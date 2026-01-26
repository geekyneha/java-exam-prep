package module3.threads;

public class Thread1 extends Thread {
    static int count=0;

    static synchronized void increment(){
        count++;
    }
    @Override
    public void run(){
        
        for(int i=0; i<1000; i++){
            increment();
        }

    }

    public static void main(String args[]) throws Exception{
         
        Thread1 t1= new Thread1();
        Thread t2 = new Thread1();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count : "+ count);
        
        
    }


    
}
