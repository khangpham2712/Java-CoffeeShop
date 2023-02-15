package mycoffeeshop.controller.search;

public class MySearch {
    public static boolean search(byte[] arr, int left, int right, byte value) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        if (value == arr[mid]) {
            return true;
        }
        else if (value < arr[mid]) {
            return search(arr, left, mid -1, value);
        }
        else {
            return search(arr, mid + 1, right, value);
        }
    }
}
