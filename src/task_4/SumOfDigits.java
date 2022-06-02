package task_4;

public class SumOfDigits {
    /*
    Q17: String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static void main(String[] args) {
        String str = "2347";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum +=Integer.parseInt(""+str.charAt(i));
        }
        System.out.println(sum);
    }



}
