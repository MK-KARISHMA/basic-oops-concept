package classes.and.objects;

public class Student {

    public int id;
    public String name;
    public String email;
    public String dob;
    public String grade;


    public Student() {

    }


    public Student(int id, String name, String email, String dob, String grade) {  // parameterized constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }



        @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
