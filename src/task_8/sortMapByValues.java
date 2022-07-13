package task_8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortMapByValues {

    // write a method that can sort Map by values
    public static void main(String[] args) {
        Map<Integer,Integer> elements=new LinkedHashMap<>();
        elements.put(4,35);
        elements.put(2,23);
        elements.put(1,97);
        elements.put(5,53);
        elements.put(3,27);
        System.out.println("Original Map: "+elements+"\nSorted Map: "+sort(elements));
    }

    public static Map sort(Map<Integer,Integer> elements){
        Map<Integer,Integer> aux=new TreeMap<>();
        for (Integer key : elements.keySet()) {
            aux.put(elements.get(key),key);
        }
        Map<Integer,Integer> newElements=new LinkedHashMap<>();
        for (Integer newValue : aux.keySet()) {
            newElements.put(aux.get(newValue),newValue);
        }
        return newElements;
    }
}
