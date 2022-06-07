package task_5;

import java.util.Arrays;

public class ArraySortAscending {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int [] arr = {10,9,8,7};
    arr=sort(arr);==>{7,8,9,10};
     */
    public static void main(String[] args) {
        int [] arr = {10,9,8,7};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }


}
