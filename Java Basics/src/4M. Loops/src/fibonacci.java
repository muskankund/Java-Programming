import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of fibonacci series u want : ");
        int n = sc.nextInt();
        int[] fibo = new int[n];
        fibo[0]=0;
        fibo[1]=1;
        for (int i=2;i<n;i++) {
            fibo[i]=fibo[i-1] + fibo[i-2];
        }
        System.out.println("Fibonacci series is : ");
        for (int i=0;i<n;i++){
            System.out.print(" " + fibo[i]);
        }
    }
}
