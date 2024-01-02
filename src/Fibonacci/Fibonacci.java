package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         int n = sc.nextInt();

         int f1 = 0;
         int f2 = 1;

         for (int i = 0; i <= n; i++){
             System.out.println(f1);
             int fibonacci = f1 + f2;
             f1 = f2;
             f2 = fibonacci;

         }

    }
}
