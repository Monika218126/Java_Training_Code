// Q7. Move All Zeros to End
// Problem: Move all zeros to end without changing order of non-zero elements.
// Input: int[] arr           Output: Modified array

// import java.util.Scanner;


public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;
        
        // WITH USER INPUT
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(); // size
        // int[] arr = new int[n];

        // // input array
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int index = 0;

        for (int num : arr)
            if (num != 0)
                arr[index++] = num;

        while (index < arr.length)
            arr[index++] = 0;

        for (int i : arr)
            System.out.print(i + " ");
    }
}