package task_7;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValue {

    public static void main(String[] args) {
        ArrayList<Integer> elements=new ArrayList<>(Arrays.asList(100,55,203,654,142,22));
        elements.removeIf(each->each>100);
        System.out.println(elements);
    }

}
