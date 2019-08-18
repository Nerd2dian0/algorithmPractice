import java.util.Iterator;
import java.util.Map;

public class MapBianLi {
    public void bianlimap(Map<Integer, Integer> map){
        // first method
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            // do something
            entry.getKey();
            entry.getValue();
        }

        // second method
        for (Integer key:map.keySet()) {
            //
            map.get(key);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //
            Map.Entry<Integer, Integer> entry = iterator.next();
            entry.getValue();
            entry.getKey();
        }
    }
}
