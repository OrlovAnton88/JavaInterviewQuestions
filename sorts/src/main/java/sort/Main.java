package sort;

/**
 * Author:      oav <br>
 * Date:        18.01.16, 19:13 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class Main {

    public static void main(String[] args) {

        final String[] arr = { "z", "a", "x","b","a","t","w","c","n","m"};

        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("-------------------");
        Quicksort.sort(arr, Comporators.getStringComporator());
        for (String s : arr) {
            System.out.println(s);
        }

    }

}
