package Polymorphism;

public class Main {
    public static void main(String[] args) {
        College college = new Teacher();
        System .out.println(college.getTotal());
        college = new Student();
                System.out.println(college.getTotal());


    }
}
