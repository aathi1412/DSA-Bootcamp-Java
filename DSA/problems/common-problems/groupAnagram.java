package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    public static void main(String[] args) {
        String[] a = {"eat", "tea", "tan","ate","nat", "bat"};

        Map<String, ArrayList<String>> map = new HashMap<>();

        List<List<String>> list = new ArrayList<>();

        for (String s : a) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sw = new String(c);

            if(!map.containsKey(sw)){
                map.put(sw, new ArrayList<>());
            }
            map.get(sw).add(s);
        }
        list = new ArrayList<>(map.values());
        System.out.println(list);
    }
}
