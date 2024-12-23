package Advance_Java.Builder_Pattern.Example_1;

public class Details {
    public static void main(String[] args) {

        User user1 = new User.userBuilder()
                .setName("Sanjeeb ray")
                .setAge(22)
                .setEmailId("sanjeeb@gmail.com")
                .setContactNo(1575484478)
                .build();

        System.out.println(user1);

        User user2 = new User.userBuilder()
                .setName("Naman koushik")
                .setAge(24)
                .setEmailId("naman@gmail.com")
                .setContactNo(1859625474)
                .build();

        System.out.println(user2);

    }
}
