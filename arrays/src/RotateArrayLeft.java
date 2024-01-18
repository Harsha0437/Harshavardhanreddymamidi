public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        System.out.println("Original Array:");
        printArray(arr);

        rotateLeft(arr, x);

        System.out.println("\nArray after rotating left by " + x + " positions:");
        printArray(arr);
    }

    public static void rotateLeft(int[] arr, int positions) {
        int n = arr.length;
        positions %= n; // Ensure positions is within the array size

        for (int i = 0; i < positions; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}