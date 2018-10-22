package javaAlgorithms.Sorting.ArrayBubble;

/**
 * Created by rbannikov on 22.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(5);

        array.into(163);
        array.into(300);
        array.into(184);
        array.into(191);
        array.into(174);

        array.printer();
        array.bubbleSorter();
        array.printer();
    }
}
