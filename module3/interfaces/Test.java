package module3.interfaces;

public class Test  {
    public static void main(String args[]){
        SmartPhone apple = new SmartPhone();
        apple.takePhoto();
        apple.recordVideo();
        apple.playMusic();
        apple.stopMusic();
        apple.makeCall("1234567890");
        apple.endCall();

    }
}
