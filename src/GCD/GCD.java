package GCD;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = sc.nextInt();
        int gcd = 0;
        int min;
        if(n1>n2){
            min = n2;
        } else{ min = n1;}

        for (int i = 1; i<=min; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
