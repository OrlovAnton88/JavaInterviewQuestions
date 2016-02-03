package concurrency.example1;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * Author:      oav <br>
 * Date:        03.02.16, 18:42 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class Main {



    public static void main(String[] args) {

        final LoadingCache<Integer, Integer> cashe = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build(
                        new CacheLoader<Integer, Integer>() {

                            public Integer load(Integer key) {
                                return key * key;
                            }
                        });

        cashe.getUnchecked(2);
        cashe.getUnchecked(3);
        cashe.getUnchecked(5);


//        Thread t = new Thread(new MyRunnable());
//        Thread t2 = new Thread(new MyRunnable());
//        t.start();
//        t2.start();

    }

}
