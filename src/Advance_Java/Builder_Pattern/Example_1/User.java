package Advance_Java.Builder_Pattern.Example_1;

public class User {

    private final String name;
    private final Integer age;
    private final String emailId;
    private final Integer contactNo;

    private User(userBuilder builder) { // takes inputs from userBuilder class and assigned/initialized in user constructor
        this.name = builder.name;
        this.age = builder.age;
        this.emailId = builder.emailId;
        this.contactNo = builder.contactNo;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public Integer getContactNo() {
        return contactNo;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailId='" + emailId + '\'' +
                ", contactNo=" + contactNo;
    }

    // Inner class
    static class userBuilder{
        private  String name;
        private  Integer age;
        private  String emailId;
        private  Integer contactNo;

//    public userBuilder() {
//
//    }

    public userBuilder setName(String name) {
            this.name = name;
            return this; // return instance variable and set it (method chaining in builder pattern)
        }

        public userBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public userBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public userBuilder setContactNo(Integer contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public User build(){ // it returns a user
        User user = new User(this);
        return user;
        }

    }
}
