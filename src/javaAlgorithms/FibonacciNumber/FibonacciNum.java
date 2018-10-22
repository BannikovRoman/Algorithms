package javaAlgorithms.FibonacciNumber;

import java.util.Scanner;

/**
 * Created by rbannikov on 22.10.2018.
 */
public class FibonacciNum {

    public static void main(String[] args) {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i){
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println("Fibonacci number:");
        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }

    }
}
