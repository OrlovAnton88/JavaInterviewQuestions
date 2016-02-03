package sort;

import java.util.Comparator;

/**
 * Author:      oav <br>
 * Date:        20.01.16, 12:29 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class Comporators {

    public static Comparator getStringComporator(){
        return new Comparator<String>() {

            public int compare(final String o1, final String o2) {
                final char[] v1 = o1.toCharArray();
                final char[] v2 = o2.toCharArray();
                final int l1 = o1.length();
                final int l2 = o2.length();
                int limit = Math.min(l1, l2);
                int k = 0;
                while(k < limit){
                    char c1 = v1[k];
                    char c2 = v2[k];
                    if(c1 != c2){
                        return c1 - c2;
                    }
                    k++;
                }
                return l1-l2;
            }
        };
    }

}
