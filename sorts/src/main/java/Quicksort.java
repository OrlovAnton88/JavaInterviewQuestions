import java.util.Comparator;
import java.util.Random;

/**
 * Author:      oav <br>
 * Date:        18.01.16, 19:10 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class Quicksort {

    /*
    Некоторые из представленных здесь реализаций используют в качестве опорного элемента один из
    крайних элементов подмассива. Эти реализации страдают одним общим недостатком: при передаче им
    уже отсортированного массива в качестве параметра, их время работы становится порядка


    В качестве опорного элемента следует выбирать случайный элемент массива, чтобы получить
    гарантированное время сортировки \Theta(n \log n) в среднем. В случае, если использование
    случайных чисел нежелательно, в качестве опорного элемента можно выбрать, например, элемент
    в середине массива, но такие алгоритмы всё равно будут работать за \Theta(n^2) времени
    на некоторых специально-сконструированных массивах.
     */
    public static final Random RND = new Random();

    private void swap(Object[] array, int i, int j) {
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int partition(Object[] array, int begin, int end, Comparator cmp) {
        int index = begin + RND.nextInt(end - begin + 1);
        Object pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (cmp.compare(array[i], pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return (index);
    }

    private void qsort(Object[] array, int begin, int end, Comparator cmp) {
        if (end > begin) {
            int index = partition(array, begin, end, cmp);
            qsort(array, begin, index - 1, cmp);
            qsort(array, index + 1, end, cmp);
        }
    }

    public void sort(Object[] array, Comparator cmp) {
        qsort(array, 0, array.length - 1, cmp);
    }
}
