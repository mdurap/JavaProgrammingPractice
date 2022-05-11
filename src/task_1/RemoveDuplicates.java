package task_1;

public class RemoveDuplicates {
    /*
        Write a return method that can remove the duplicated values from String
    Ex:
    removeDup (" AAABBBCCC")==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String unique="";
        for (int i = 0; i < str.length(); i++) {
            if(!unique.contains(""+str.charAt(i))){
                unique+= str.charAt(i);
            }
        }
        System.out.println(unique);

        System.out.println("removeDup(AAABBBCCCEEff) = " + removeDup("AAABBBCCCEEff"));


    }

    public static String removeDup(String str){
        String unique="";
        for (int i = 0; i < str.length(); i++) {
            if(unique.contains(""+str.charAt(i))){
                continue;
            }else{
                unique+=str.charAt(i);
            }
        }
        return unique;
    }



}
