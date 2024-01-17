public class Reversedigit {
    static int reversedigit(int digit) {
        int reversenumber = 0;
        while (digit > 0){
            int remainder = digit % 10;
            reversenumber = reversenumber * 10 + remainder;
            digit /= 10;
        }


        return reversenumber;
    }

public static void main(String[] args) {
    System.out.println(reversedigit(12345));

}


}

