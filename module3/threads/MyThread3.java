package module3.threads;

public class MyThread3  extends Thread{

   @Override
   public void run(){
     System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        
        } catch (InterruptedException e) {
            System.out.println(e);
          
        }
   }


    public static void main(String args[]) throws InterruptedException {
        // Thread is created but not yet started
        MyThread3 t1= new MyThread3();
       System.out.println(t1.getState());
       
       // Thread is started and now is ready to run
       t1.start();
       System.out.println(t1.getState());

       Thread.sleep(1000);
       System.out.println(t1.getState());
       t1.join();
         System.out.println(t1.getState());

    }
    
}
