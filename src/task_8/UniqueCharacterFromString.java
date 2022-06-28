package task_8;

import java.util.*;

public class UniqueCharacterFromString {

    // Find unique characters of a string and put them in a map with number of occurrence as 1,
    // For ex: "aabccddeffft" ---> { b=1,e=1,t=1}


    public static void main(String[] args) {
        String str = "aabccddeffft";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) == 1) {
                map.put(list.get(i) , 1);
            }
        }
        System.out.println(map);

    }

}
