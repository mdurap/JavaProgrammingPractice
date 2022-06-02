package task_4;

public class FindMax {
    /*
    Q19: Array - Find Maximium
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int [] arr = {1,3,8,5,34,76,23};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max number is "+ max);



    }


}
