package Binary;

public class ReverseArray {

        public static void main(String[] args) {
            int a[] = {1, 2, 3, 4, 5, 6};
            int i = 0, j = a.length - 1, temp;
            while (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }


            System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4] + " " + a[5]);
        }
}
