package task_1;

import java.util.Scanner;

public class swapNumbers {

    //Swap two variable' values without using a third variable

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();

        num1= num1+num2;
        num2= num1-num2;
        num1= num1-num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
