package Abstraction;

public class Designation extends Department{
    int getDepartmentSize() {
        return 50;
    }

    public static void main(String[] args) {
        Designation designation = new Designation();
        System.out.println(designation.getDepartmentSize());
    }
}
