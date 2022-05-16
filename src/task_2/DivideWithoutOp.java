package task_2;

public class DivideWithoutOp {
    /*
             Numbers Divide without / operator
         Write a method that can divide two numbers without using division operator (/)
      */
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 3;
        int result=0;

        while (num1>=num2){
            num1 = num1-num2;
            result++;
        }
        System.out.println(result);
    }
}
