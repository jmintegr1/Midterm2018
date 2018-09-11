package datastructure;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "New Yor City");
        map.put(2, "Miami");
        map.put(3, "Dallas");
        map.put(4, "Hollywood");
        map.put(5, "Philadelphia");
        map.put(6, "Chicago");

        for (Map.Entry<Integer, String> Jewell : map.entrySet()) {
                System.out.println("collection view :" + Jewell.getKey()
                        + ":" + Jewell.getValue());
        }
    }
}
