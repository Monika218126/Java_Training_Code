// Q11. Subarray with Given Sum
// Problem: Find if there exists a subarray with given sum.

// Input: int[] arr, int target       Output: Yes / No


import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
         try(Scanner po = new Scanner(System.in)){

        // Input size
        int n = po.nextInt();

        // Input array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = po.nextInt();
        }

        // Target sum
        int target = po.nextInt();

        int sum = 0;
        int start = 0;

        // Sliding window
        for(int end = 0; end < n; end++) {
            sum += arr[end];

            // Shrink window if sum > target
            while(sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            // Check condition
            if(sum == target) {
                System.out.println("Yes");
                return;
            }
        }
        
    }
        System.out.println("No");
        
    }
}