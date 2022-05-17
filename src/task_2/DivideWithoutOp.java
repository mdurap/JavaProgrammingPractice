package task_2;

import java.util.Scanner;

public class DivideWithoutOp {
    /*
             Numbers Divide without / operator
         Write a method that can divide two numbers without using division operator (/)
      */
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        divideOperator(num1,num2);
    }

    private static int divideOperator(int num1, int num2) {

        int result=0;



        while (num1>=num2){
            if(num2==0){
                System.out.println("invalid input");
                break;
            }
            num1 = num1-num2;
            result++;
        }
        return result;
    }
}
