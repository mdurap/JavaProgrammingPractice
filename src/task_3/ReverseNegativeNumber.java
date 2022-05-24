package task_3;

public class ReverseNegativeNumber {

    /*
    Write a return method that can reverse negative number and return it as int for example
    input
    -12345
    output
    -54321
     */

    public static int revNegNum(int num){
     int reversed=0;
        while(num!=0){
            int lastDigit=(num%10);
            reversed=reversed*10+lastDigit;
            num/=10;
        }
            return reversed;
    }

    public static void main(String[] args) {
        System.out.println(revNegNum(-12345));
    }

}
