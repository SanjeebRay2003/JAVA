package OOPs.methods.Practice;

class Employee{

    int salary ;

    public int getSalary(int salary){
        return salary;
    }

     String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class practice_5 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.getSalary(40000));



        employee.setName("Aman kumar");
        System.out.println(employee.getName());

    }
}
