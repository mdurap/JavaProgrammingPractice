package task_2;

import java.util.Scanner;

public class PrimeNumber {
    /*
        Numbers Prime Number
    Write a method that can check if a number is prime or not
     */
    public static void primeNum(int num){

        boolean isPrime= num>=2;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                 isPrime=false;
                 break;
            }
        }

        if(isPrime){
            System.out.println(num+ " is prime" );
        }else{
            System.out.println(num+ " is not prime");
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        primeNum(input.nextInt());

    }

}
