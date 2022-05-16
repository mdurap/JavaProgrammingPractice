package task_2;

import java.util.Scanner;

public class SameLetters {
    /*
     String Same letters: Write a return method that check if a string is build out of the same letters as another string.
        Ex:
        same("abc","cab"); --> true
        same("abc",","abb"); --> false
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 String");
        String str= input.next();
        String s= input.next();

        System.out.println(isSameLetter(str,s));

        System.out.println("===============");

        System.out.println(isSameLetter("abc", "abb"));

    }

    private static boolean isSameLetter(String str, String s) {

        boolean result = true;
        if (str.length() == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (str.contains("" + s.charAt(i))) {
                    str = str.replaceFirst("" + s.charAt(i), "");
                }
            }
        }
        if (str.isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
