package Advance_Java.Builder_Pattern.Example_2;

import Advance_Java.Exception_Handling.Student_Marks;

public class Students {

    private final String name;
    private final String fathersName;
    private final Integer standard;
    private final Integer contactNo;
    private final Integer marks;

    private Students(studentDetails details) {  // private constructor b/c now no one can initialize the instance variable by directly calling the constructor
//        Students.name = studentDetails.name // assigning the value of name from studentDetails to Students
        this.name = details.name;
        this.fathersName = details.fathersName;
        this.standard = details.standard;
        this.contactNo = details.contactNo;
        this.marks = details.marks;
    }

    public String getName() {
        return name;
    }

    public String getFathersName() {
        return fathersName;
    }


    public Integer getStandard() {
        return standard;
    }

    public Integer getContactNo() {
        return contactNo;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Students{\n" +
                "name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", standard=" + standard +
                ", contactNo=" + contactNo +
                " \n}";
    }

    // inner class which set the values
    static class studentDetails{

        private  String name;
        private  String fathersName;
        private  Integer standard;
        private  Integer contactNo;
        private Integer marks;

        public studentDetails setName(String name) {
            this.name = name;
            return this;
        }

        public studentDetails setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }

        public studentDetails setStandard(Integer standard) {
            this.standard = standard;
            return this;
        }

        public studentDetails setContactNo(Integer contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public studentDetails setMarks(Integer marks) {
            this.marks = marks;
            return this;
        }

        public Students build(){
            Students students = new Students(this); // "this" pass the current instance value to Students constructor
                    return students;
        }
    }
}
