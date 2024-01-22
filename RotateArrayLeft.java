package Binary;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array, positions);

        System.out.println("\nArray after left rotation:");
        printArray(array);
    }

    public static void rotateLeft(int[] arr, int positions) {
        int n = arr.length;

        // Normalize the number of positions
        positions = positions % n;

        // Create a temporary array to store rotated elements
        int[] temp = new int[positions];

        // Copy the first 'positions' elements to temp
        System.arraycopy(arr, 0, temp, 0, positions);

        // Shift the remaining elements to the left
        System.arraycopy(arr, positions, arr, 0, n - positions);

        // Copy back the elements from temp to the end of the array
        System.arraycopy(temp, 0, arr, n - positions, positions);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

