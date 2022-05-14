package task_2;

import java.util.Scanner;

public class NumbersFinra {
    /*
        Numbers FINRA
        Write a method which prints out the numbers from 1 to 30 but for numbers which area multiple of 3 ,print "FIN“ instead of the number and for numbers which area multiple of 5, print "RA“ instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA“ instead of the number.
        Ex: 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 …
     */

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num= input.nextInt();
//        if(num%15==0){
//            System.out.println("FINRA");
//        }else if(num%3==0){
//            System.out.println("FIN");
//        }else if(num%5==0){
//            System.out.println("RA");
//        }else{
//            System.out.println(num);
//        }

        //System.out.println("==================");

        System.out.println(Finra());

    }

    public static String Finra(){
        String result="";
        String str="";
        for (int i = 1; i <=30; i++) {
            if(i%15==0){
               result="FINRA";
            }else if(i%3==0){
                result ="FIN";
            }else if(i%5==0){
               result="RA";
            }else{
                result=""+i;
            }
            str+=result+" ";
        }
        return str;
    }




}
