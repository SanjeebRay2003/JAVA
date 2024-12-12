package OOPs.Polymorphism;
interface Camera{
    void takePicture();
    void recordVideo();
}

interface Torch{
    void openTorch();
}

interface GPS {
    void trackGPS();
}

class Keypad_Phone{
    void call (int number){
        System.out.println("Calling to "+number);
    }

    void pickCall(){
        System.out.println("Speaking in call");
    }
}

class SmartPhone extends Keypad_Phone implements Camera, GPS, Torch {

    @Override
    public void takePicture() {
        System.out.println("Clicking picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void trackGPS() {
        System.out.println("Tracking your phone");
    }

    @Override
    public void openTorch() {
        System.out.println("Open torch");
    }
}




public class Polymorphism {
    public static void main(String[] args) {
        Camera camObj = new SmartPhone();
        camObj.takePicture();
        camObj.recordVideo();


    }
}


