package task_1;

public class NumbersOddEven {
    /*
    Write a method which can identify given number is even or odd
Example:
identify(5)
5)-->"
identify(6)
6)-->"
     */

    public static String oddMethod(int num){
        if(num % 2 ==0){
            return "Even number";
        }else{
            return "Odd number";
        }
    }



}
