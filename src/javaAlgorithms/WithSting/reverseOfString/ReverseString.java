package javaAlgorithms.WithSting.reverseOfString;

import java.util.Scanner;

public class ReverseString {

    public void reverseOfString() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the String you would like to reverse:");
        String str = scanner.nextLine();

        scanner.close();

        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Initial string: " + str);
        System.out.println("Reserved string: " + reversedStr);
    }

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        reverseString.reverseOfString();

    }
}
