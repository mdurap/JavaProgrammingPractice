package task_1;

public class FindUnique {
    /*
        Write a return method that can find the unique characters from the String
    Ex:
    unique("AAABBBCCCDEF") ==>"DEF"
     */
    public static void uniqueChar(){
        String str="AAABBBCCCDEF";


        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                System.out.print(str.charAt(i));
            }
        }

    }


    public static void main(String[] args) {
        uniqueChar();
    }


}
