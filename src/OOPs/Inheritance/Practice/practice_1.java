package OOPs.Inheritance.Practice;

import OOPs.methods.Practice.Cylinder;

class circle{
    int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle{
   int height;
   public double volume(){
       return Math.PI*this.radius*this.radius*this.height;
   }
}

public class practice_1 {
    public static void main(String[] args) {

        cylinder obj = new cylinder();
        obj.radius = 50;
        System.out.println(obj.area());

        obj.height = 20;
        System.out.println(obj.volume());


    }
}
