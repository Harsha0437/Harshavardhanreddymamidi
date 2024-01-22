package Binary;

public class BinarySearch {

        public static void main(String[] args) {
            int[] arr = {11, 12, 22, 25, 34, 64, 90};

            System.out.println("Sorted Array:");
            displayArray(arr);

            int i = 25;

            int index = binarySearchArray(arr, i);

            // Display the search result
            if (index != -1) {
                System.out.println("\nElement " + i + " found at index " + index);
            } else {
                System.out.println("\nElement " + i + " not found in the array");
            }
        }

        // Function to perform Binary Search on a sorted array
        private static int binarySearchArray(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return -1;
        }

        private static void displayArray(int[] arr) {
            for (int num : arr) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

