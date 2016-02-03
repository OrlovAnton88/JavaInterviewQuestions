package collection;

import java.util.*;

/**
 * Author:      oav <br>
 * Date:        01.02.16, 17:21 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class MainTest {

    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        List<String> list = new ArrayList<>();
//
        Queue queue = new PriorityQueue();
//        queue.add("test1");
//        queue.add("test2");
//        queue.add("test3");
//
////        System.out.println(queue.peek());
////        System.out.println(queue.poll());
//        final Object poll = queue.poll();
//        for (Object o : queue) {
//            System.out.println(o);
//        }
        Deque<String> deque = new ArrayDeque<>();
        deque.add("test1");
        deque.add("test2");
        deque.add("test3");

        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
    }

}
