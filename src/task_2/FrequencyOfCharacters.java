package task_2;

public class FrequencyOfCharacters {
    /*
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        frequencyMeth("AAABBCDD");


    }

    private static String frequencyMeth(String str) {
        //String str = "AAABBCDD";
        String checked="";
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            if(checked.contains(""+str.charAt(i))){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            checked+=str.charAt(i)+""+count;
        }
       return checked;
    }

}
