package task_3;

public class ArmstrongNumber {
    /*
     Write a method that can check if a number is Armstrong number
    153, 370, 371 are Armstrong numbers
    1^3+5^3+3^3=153
     */

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            isArmstrong(i);
        }
    }

    public static void isArmstrong(int number) {

        int lastDigit = 0;
        int totalDigits = 0;
        int originalNumber = number;

        while (number > 0) {

            lastDigit = number % 10;

            number = number / 10;

            totalDigits += lastDigit * lastDigit * lastDigit;
           // totalDigits+=Math.pow(lastDigit,3);

        }
        if (totalDigits == originalNumber) {

            System.out.println(originalNumber);

        }

    }

}
