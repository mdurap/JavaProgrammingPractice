package task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveName {

    public static ArrayList<String> removeDuplicates(ArrayList<String> names){

        names.removeIf(name -> Collections.frequency(names, name) > 1);
        //names.removeIf(name -> name.equals("David"));
        return names;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("David","John","Eric","David","John"));
        System.out.println(removeDuplicates(names));
    }


}
