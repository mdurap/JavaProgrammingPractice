package task_6;

public class MoveZeros {
    public static void main(String[] args) {

        //Move all zero to the end

        int arr[] = {1, 0, 2, 0, 3, 4, 0};
        int i, count = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[count++] = arr[i];
            }
        }
        // at the end push all zero elements
        while (count < arr.length) {
            arr[count++] = 0;

        }
        //Print the array value
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }


    }

    private static int[] moveZeroEnd2(int[] arr) {
        int[] send = new int[arr.length];
        for (int i = 0 , j = 0; i < send.length; i++) {
            if (arr[i] != 0)
                send[j++] = arr[i];
        }
        return send;
    }

}
