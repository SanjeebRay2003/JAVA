package OOPs.Inheritance;

// It is a parent class
class parent{
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("i set the id "+id);
    }

    public void print(){
        System.out.println("this is a constructor");
    }
}

// It is a child class which extends parent class (Inherit)
class child extends parent{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("i set the name "+name);
    }
}


// main class
public class inheritance {

    public static void main(String[] args) {

        child childObj = new child(); // object of child class which inherit parent class
                                        // that's why we also access the parent class

        childObj.setName("Man");
        System.out.println(childObj.getName());

        childObj.setId(12);
        System.out.println(childObj.getId());



    }

    /* when we call child class which is inherit the parent class
    we access both but
    if we call the parent class we only able to access the parent class not the child class
     */
}
