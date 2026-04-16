// Q12. Longest Substring Without Repeating Characters (Basic Approach)
// Problem: Find length of longest substring without repeating characters.
// Input: String  z         Output: Integer length


import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); // user input string

        boolean[] visited = new boolean[256];

        int max = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {

            while (visited[s.charAt(end)]) 
            {
                visited[s.charAt(start)] = false;
                start++;
            }

            visited[s.charAt(end)] = true;
            max = Math.max(max, end - start + 1);
        }

        System.out.println("Longest substring length: " + max);
        sc.close();
    }
}