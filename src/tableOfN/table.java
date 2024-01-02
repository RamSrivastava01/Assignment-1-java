package tableOfN;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int times = 1;

        for (int i = n; i <= n*10; i+=n){
            System.out.println(n + "x" + times +" = " + i );
            times = times + 1;
        }
    }
}
