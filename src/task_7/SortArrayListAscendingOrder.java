package task_7;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListAscendingOrder {

    //write a method that can sort the arraylist in Ascending order
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(2,3,5,8,11,1,7,4));
//        Collections.sort(list);
//        System.out.println(list);
        int temp=0;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(j)>list.get(j+1)){
                    temp=list.get(j+1);
                    list.set(j+1,list.get(j));
                    list.set(j,temp);

                }

            }

        }
        System.out.println(list);
    }

    /*
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 7 ,0, -4, 6, 1));
        for (int i = 0 ; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(j) < list.get(i)) {
                    Collections.swap(list, j, i);
                }
            }
        }
        System.out.println(list);
    }
     */




}
