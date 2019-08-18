/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 然后按从左至右、从上至下重新输出字符串
 */

import java.util.ArrayList;
import java.util.List;

public class NString {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int i = 0; i<Math.min(numRows, s.length()); i++) {
            list.add(new StringBuilder());
        }
        Boolean drop = false;
        int curRows = 0;
        for (char a : s.toCharArray()) {
            if (curRows == 0 || curRows == numRows-1)
                drop = !drop;
            list.get(curRows).append(a);
            if (drop) {
                curRows++;
            }else {
                curRows--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<Math.min(numRows, s.length()); i++) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}
