package Lambda_Expressions;

interface racing{
    int race(int speed ,boolean wins);
}
public class Race {
    public static void main(String[] args) {

        racing start = (speed, wins) -> {
            System.out.println("speed is " +speed+" and the racer wins "+wins);
            return speed;
        };


        start.race(120,true);

    }
}