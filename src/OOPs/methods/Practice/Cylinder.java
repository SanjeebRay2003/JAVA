package OOPs.methods.Practice;

class math{
    int radius;
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class Cylinder {
    public static void main(String[] args) {
        math operation = new math();
        operation.setHeight(15);
        System.out.println(operation.getHeight());
        operation.setRadius(5);
        System.out.println(operation.getRadius());

    }
}
