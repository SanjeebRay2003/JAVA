package Advance_Java.Inner_Classes.Member_innerClass;

public class Car {
    public String model;
    public Boolean engineOn;

    public Car(String model){
        this.model=model;
        this.engineOn=false;
    }

    class Engine{
        public void start(){
            if (!engineOn){
                engineOn = true;
                System.out.println(model+" Engine Start");
            }
            else {
                System.out.println("Engine is already on");
            }
        }

        public void stop(){
            if (engineOn){
                engineOn=false;
                System.out.println("stop the engine");
            }
        }
    }
}
