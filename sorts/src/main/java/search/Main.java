package search;

import sort.Comporators;
import sort.Quicksort;

/**
 * Author:      oav <br>
 * Date:        20.01.16, 12:24 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class Main {

    public static void main(String[] args) {
//        int arr[] = {1,4,2,3,10,99,108};

        String[] arr = { "z", "a", "x","b","a","t","w","c","n","m"};

        Quicksort.sort(arr, Comporators.getStringComporator());

//        final int i = BinarySearch.indexOf(arr, 3);

//        System.out.println("index : " + i);
    }

}
