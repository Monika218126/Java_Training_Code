// Q8. Find Duplicate Element (Single Duplicate)
// Problem: Array contains n+1 elements with numbers from 1 to n. Find duplicate without extra space.
// Input: int[] arr          Output: Duplicate number


import java.util.Scanner;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Find intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find entrance of cycle (duplicate)
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size
        int[] nums = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(nums);

        System.out.println("Duplicate element: " + duplicate);
        sc.close();
    }
}