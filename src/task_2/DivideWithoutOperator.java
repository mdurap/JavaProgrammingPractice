package task_2;

import java.util.ArrayList;

public class DivideWithoutOperator {
    /*
            Numbers Divide without / operator
        Write a method that can divide two numbers without using division operator (/)
     */
    public static void main(String[] args) {
        int number=35;
        int num1=12;// 35/12 = result
        int num2 = 0;
        int num=0;
        if(number>num1){
            num=number-number%num1;
        }


        ArrayList <Integer> list= new ArrayList<>();
        for (Integer i = 1; i <= num; i++) {
            if(num%i==0){
                list.add(i);
            }
        }
        if(list.contains(num1)){
             num2= list.size()-1-list.indexOf(num1);
        }

        System.out.println("Result is "+list.get(num2));

//        System.out.println(list);
//        System.out.println(list.size());

    }



}
