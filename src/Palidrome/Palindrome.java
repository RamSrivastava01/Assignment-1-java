package Palidrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String dummystr = "";

        for (int i = str.length()-1; i>=0; i--){
            dummystr = dummystr + str.charAt(i);
         }
    if (dummystr.equals(str)){
        System.out.println(str + " is a palindrome ");
    }else {
        System.out.println("Not a palindrome");
    }
    }
}
