package Super;

class Employee {
    String name;
    String designation;


    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

class manager extends Employee {
    double salary;

    public manager(String name, String designation, double salary) {
        super(name, designation);
        this.salary = salary;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
    }
}


public class Super {
    public static void main(String[] args) {
        Employee emp = new Employee("Ramesh", "Software Engineer");
        System.out.println("Employee Details:");
        emp.displayDetails();
        manager mgr = new manager("Shubhash", "Project Manager", 100000.00);
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}
