package javaAlgorithms.WithString;

import java.util.Scanner;

public class Palindrome {

    public void isPalindrome () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the String:");
        String str = scanner.nextLine();

        scanner.close();

        if (str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println(str + " is palindrome!");
        } else {
            System.out.println(str + " isn't palindrome!");
        }
    }

    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome();
    }

}
