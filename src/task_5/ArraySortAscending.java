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

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("================================");


        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){  // 10>9   {10,9,8,7};  {9,10,8,7};
                    temp = arr[j+1];  // temp = 9-8
                    arr[j+1] = arr[j];  //{10,10,8,7};    {9,10,10,7};
                    arr[j] = temp;     //{9,10,8,7};       {9,8,10,7};
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }


}
