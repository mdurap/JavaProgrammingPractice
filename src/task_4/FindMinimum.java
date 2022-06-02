package task_4;

public class FindMinimum {
    /*
    Q18: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int [] arr = {1,3,8,-5,34,76,23};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("Min number is "+ min);



    }
}
