package javaAlgorithms.Sorting.ArrayBubble;

/**
 * Created by rbannikov on 22.10.2018.
 */
public class ArrayBubble {
    private long[] a;
    private int elems;

    public ArrayBubble(int max){
        a = new long[max];
        elems = 0;
    }

    public void into(long value){
        a[elems] = value;
        elems++;
    }

    public void printer(){
        for (int i = 0; i < elems; i++){
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        long dummy = a[first];      //во временную переменную помещаем первый элемент
        a[first] = a[second];       //на место первого ставим второй элемент
        a[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorter(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(a[in] > a[in + 1])               //Если порядок элементов нарушен
                    toSwap(in, in + 1);             //вызвать метод, меняющий местами
            }
        }
    }

}
