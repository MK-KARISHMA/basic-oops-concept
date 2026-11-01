package classes.and.objects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello all, Welcome to spring1 module" );

        Student student1 = new Student();

        System.out.println("student1 before assigning the values : " + student1);

        student1.id = 101;
        student1.name = "Karishma";
        student1.email = " abc@gmail.com";
        student1.dob = "13/06/1998";
        student1.grade = "A+";

        System.out.println("student1 after assigning the values : " + student1);


        Student student2 = new Student(102, "Zain", "xyz@gmail.com", "20-09-2024", "A+" );

        System.out.println("student2 before assigning the values : " + student2);

        Demo demo1 = new Demo();
        demo1.demo1();
        System.out.println("Non static veriable: " + demo1.aaa);

        Demo.demo2();
        System.out.println("Static variable " + Demo.bbb);

    }
}
