package task_2;

public class DivideWithoutOp {
    /*
             Numbers Divide without / operator
         Write a method that can divide two numbers without using division operator (/)
      */
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 12;
        int result=0;

        if(num2==0){
            System.out.println("invalid input");

        }
        while (num1>=num2){
            num1 = num1-num2;
            result++;
        }
        System.out.println(result);
    }
}
