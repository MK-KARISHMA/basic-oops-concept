package encapsulation.example;

public class Main {

    public static void main(String[] args) {


        Teacher teacher = new Teacher();

        teacher.setId(101);
        teacher.setName("Karishma");
        teacher.setEmail("abc@gmail.com");
        teacher.setQualification("MCA");
        teacher.setSalary(141000.00);
        System.out.println("teacher :  "  +  teacher);

    }
}
