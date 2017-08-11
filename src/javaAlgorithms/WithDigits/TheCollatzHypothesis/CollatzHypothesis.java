package javaAlgorithms.WithDigits.TheCollatzHypothesis;

import java.util.Scanner;

public class CollatzHypothesis {

    public int TheCollatzHypothesis () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 1: ");

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("You entered 1. Try again!");
            TheCollatzHypothesis();
        }

        return numberOfSteps(number);
    }

    private int numberOfSteps (int number) {

        int count = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                count++;
            } else {
                number *=3 + 1;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        CollatzHypothesis collatzHyp = new CollatzHypothesis();
        System.out.println("Number of steps to 1:");
        System.out.println(collatzHyp.TheCollatzHypothesis());

    }

}
