package Advance_Java.Nested_Classes.Anonymous_innerClass;

interface UserDetails{
    void name(String name);
    void email(String email);
    void salary(String salary);
}

public class Anonymous {
    public static void main(String[] args) {

        UserDetails user = new UserDetails() { // Anonymous class => it is used for non-functional interface
            @Override
            public void name(String name) {
                System.out.println(name);

            }

            @Override
            public void email(String email) {
                System.out.println(email);
            }

            @Override
            public void salary(String salary) {
                System.out.println(salary);
            }
        };


       user.name("Dinesh kartik");
       user.email("dinesh@gmail.com");
       user.salary("55000");
        
    }
}
