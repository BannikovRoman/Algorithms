package javaAlgorithms.Sorting.InsertionSort;

import java.util.Arrays;

/**
 * Created by rbannikov on 22.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = { 5, 89, 5, -4, 0, 56, 3, 2, 6, -9 };
        int[] result = insertsort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertsort(int[] sourceArray) {
        int[] destinationArray = new int[sourceArray.length];
        int destinationSize = 0;
        for (int n = 0; n < sourceArray.length; n++) {

            // Ищем место для вставки
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < sourceArray[n]) {
                    insertIndex++;
                }
            }

            // Вставка
            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = sourceArray[n];
            destinationSize++;
        }
        return destinationArray;
    }
}
