package module3.interfaces;

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override

    public void takePhoto(){
        System.out.println("Taking a photo...");

    }
    @Override
    public void recordVideo(){
        System.out.println("Recording a video...");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing Music...");
        
    }

    @Override
    public void stopMusic(){
        System.out.println("Stopping Music...");
    }
      @Override
      public void forwardMusic(){
        System.out.println("Music is forwared by 1sec.");
      }
    @Override

    public void makeCall(String number){
        System.out.println("Calling " + number);
    }

    public void endCall(){
        System.out.println("Call Ended.");
    }


   
    
}
