package Binary;

public class FindLargestSmallest {
    public static void main(String[] args) {
        int[] integerArray = {4, 2, 9, -5, 1, 8, 0};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : integerArray) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}

