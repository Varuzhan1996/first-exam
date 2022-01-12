package com.aca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task 1
       /* System.out.print("Plese Input Number : ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The Output is : " + sum);*/
        System.out.print("Plese Input String : ");
        String str = new Scanner(System.in).nextLine();
        System.out.println(iSpalindrome(str));
    }

    static boolean iSpalindrome(String str) {
        int length = str.length();
        int start = 0;
        int end = length - 1;
        while (end > start) {
            char forwardChar = str.charAt(start++);
            char backwardChar = str.charAt(end--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }
}





