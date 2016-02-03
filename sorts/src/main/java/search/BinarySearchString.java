package search;

/**
 * Author:      oav <br>
 * Date:        20.01.16, 12:32 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class BinarySearchString {

    private BinarySearchString() {
    }

        public static int indexOf(int[] a, int key) {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi) {
                // Key is in a[lo..hi] or not present.
                int mid = lo + (hi - lo) / 2;

//                if      (key < a[mid]){
                if      (key < a[mid]){
                    hi = mid - 1;
                }
                else if (key > a[mid]){
                    lo = mid + 1;
                }
                else return mid;
            }
            return -1;
        }

}
