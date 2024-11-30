package OOPs.Practice_Abstraction_Interface_Polymorphism;

interface SmartTvRemote{
    void zoom();
    void voiceAssistant();
}

interface TvRemote extends SmartTvRemote{
    void volumeUp();
    void volumeDown();
    void next();
    void previous();
}

class Tv implements TvRemote{

    @Override
    public void volumeUp() {
        System.out.println("volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("volume down");
    }

    @Override
    public void next() {
        System.out.println("next chanel");
    }

    @Override
    public void previous() {
        System.out.println("previous chanel");
    }

    @Override
    public void zoom() {
        System.out.println("zoom the screen");
    }

    @Override
    public void voiceAssistant() {
        System.out.println("using void assistant");
    }
}


public class practice_4 {
    public static void main(String[] args) {

        Tv tv = new Tv();
        tv.next();
        tv.previous();
        tv.volumeUp();
        tv.volumeDown();
        tv.zoom();
        tv.voiceAssistant();

    }
}
