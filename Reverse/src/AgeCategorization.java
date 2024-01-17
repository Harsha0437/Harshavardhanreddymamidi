public class AgeCategorization {
    public static void main(String[] args) {
        int personAge = 21;
        categorizeAge(personAge);
    }

    public static void categorizeAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
