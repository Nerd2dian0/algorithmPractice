/**
 * accddeffss ---> a_1_c_2_d_2...
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public String convert(String s) {
//        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char a:s.toCharArray()) {
            if (map.containsKey(a)) {
                int value = map.get(a) + 1;
                map.put(a,value);
            } else {
                map.put(a, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char a :map.keySet()) {
            sb.append(a).append("_").append(map.get(a)).append("_");
        }

        return sb.toString().substring(0,sb.length()-1);
    }
}
