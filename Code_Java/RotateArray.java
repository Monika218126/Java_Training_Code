// Q10. Left Rotate Array by K Steps
// Problem: Rotate array left by k steps without extra array.

// Input: int[] arr, int k      Output: Rotated array


public class RotateArray {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr)
            System.out.print(i + " ");
    }
}