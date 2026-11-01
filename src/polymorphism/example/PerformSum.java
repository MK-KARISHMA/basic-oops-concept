package polymorphism.example;

public class PerformSum {

    // compile time polymorphism that is Method Overloading , here function name is same but differ in Parameter. so this is called Polymorphism - same method acting in differ form is called as Polymorphism

    public void  sum(int a, int b) {
        System.out.println("sum of two int numbers : " + (a + b));
    }

    public void  sum(int a, int b, int c) {
        System.out.println("sum of three int numbers : " + (a + b + c));
    }

    public void  sum(int a, float b, double c) {
        System.out.println("sum of one int, one float and one double numbers : " + (a + b + c));
    }

}
