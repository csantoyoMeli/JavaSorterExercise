import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        System.out.println("***** BUBBLESORT *****");
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    T aux = (T) arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

    }
}
