package task_1;

import java.util.Scanner;

public class NumbersOddEven {
    /*
    Write a method which can identify given number is even or odd
Example:
identify(5)
5)-->"
identify(6)
6)-->"
     */

    public static String evenOddMethod(int num){
        if(num % 2 ==0){
            return "Even number";
        }else{
            return "Odd number";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num=input.nextInt();

        System.out.println(evenOddMethod(num));


    }


}
