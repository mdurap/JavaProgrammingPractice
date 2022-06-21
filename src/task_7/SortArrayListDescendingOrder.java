package task_7;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListDescendingOrder {
    //write a method that can sort the arraylist in descending order
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,3,5,8,11,1,7,-4));

        System.out.println("DescendingOrder(list) = " + DescendingOrder(list));

    }

    public static ArrayList<Integer> DescendingOrder(ArrayList<Integer> list) {

//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);

        int temp=0;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(j)<list.get(j+1)){
                    temp=list.get(j+1);
                    list.set(j+1,list.get(j));
                    list.set(j,temp);

                }

            }

        }
        return list;
    }
}
