package task_8;

import java.util.HashMap;
import java.util.Map;

public class minValueOfMap {

    // write a method that can return the minimum value from a map()

    public static void main(String[] args) {

        Map<String,Integer> order = new HashMap<>();
        order.put("tomato",6);
        order.put("banana",2);
        order.put("apple",1);
        order.put("strawberry",7);
        order.put("berry",-4);
        order.put("cucumber",5);

        System.out.println(order.values());
        System.out.println(order.keySet());
        int min = order.get("tomato");
        for(Integer each : order.values()) {

            if(each<min){
                min=each;
            }

        }
        System.out.println(min);
    }

}
