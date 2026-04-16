// Q3. Strong Number
// Problem: A number is strong if sum of factorial of digits equals the number.
// Input: Integer n          Output: Strong / Not Strong


import java.util.Scanner;
public class StrongNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt(); // 45
        int temp=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            int fact=1;
             for (int i = 1; i <= d; i++) {
                fact *= i;
            }
        
        sum=sum+fact;
        n/=10;
        System.out.println("The Fact" + fact + sum);
        }
        
        if (temp==sum) 
             System.out.print("Strong Number ");
        else
            System.out.print("Not Strong Number ");
        sc.close();
        
    }
}





/*  // WITH METHODS
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void checkStrong(int n) {
        
            sum += factorial(d);
            
        }
*/