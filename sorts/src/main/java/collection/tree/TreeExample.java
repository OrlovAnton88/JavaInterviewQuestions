package collection.tree;

import java.util.Map;
import java.util.TreeMap;

/**
 * Author:      oav <br>
 * Date:        04.02.16, 12:34 <br>
 * Company:     SofIT labs <br>
 * Revision:    $Id$ <br>
 * Description: <br>
 */
public class TreeExample {

    public static void main(String[] args) {
        Map<Person,String> tree= new TreeMap<>();
        tree.put( new Person("Alan","Lee"),"first");
        tree.put(new Person("John", "Dow"), "second");
        tree.put( new Person("Marty","McFly"),"tenth");
        tree.put( new Person("Billy","McFly"),"last");

        for (Person person : tree.keySet()) {
            System.out.println(person.toString());
        }


    }

}
