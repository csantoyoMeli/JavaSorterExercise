import java.lang.reflect.Array;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Time time = new Time();

        Integer iArray[] = {5, 8, 9, 6, 3, 2, 1, 4, 7, 0};
        /*Integer[] iArray = new Integer[10000];
        for(int i = 0; i < iArray.length; i++){
            iArray[i] = (int)(Math.random() * (10000 - 0));
        }*/

        Sorter q = (Sorter) MiFactory.getInstance("sorter");
        Comparator<Integer> intC = (a, b) -> a-b;

        time.start();
        q.sort(iArray, intC);
        time.stop();
        System.out.println(time.elapsedTime() + "ms");

        for(int n: iArray) {
            System.out.println(n);
        }
    }
}
