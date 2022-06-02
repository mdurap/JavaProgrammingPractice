package task_4;

public class FindMinimum {
    /*
    Q18: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int [] arr = {1,3,2,-5,-13,67,32};
        int min=Integer.MAX_VALUE; //int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("Min number is "+ min);



    }
}
