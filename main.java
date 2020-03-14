import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println( isOneToOne(args[0], args[1]) );
    }

    public static boolean isOneToOne(String s1, String s2) {

        //Read each Character from both String and put into Char Array
        char[] S1Array = s1.toCharArray();
        char[] S2Array = s2.toCharArray();

        //HashMap for checking duplicate keys
        HashMap<String, String> HM = new HashMap<>();

        //if length match - continue
        if(lengthCheck(s1, s2)){
            //Read from Char Array into HashMap
            for(int i = 0; i < s1.length(); i++){
                //Turn both Char Array into String type
                String currentX = String.valueOf(S1Array[i]);
                String currentY = String.valueOf(S2Array[i]);
                //If key seen before, stop and return false
                if(!HM.containsKey(currentX)){
                    HM.put( currentX, currentY);
                } else {
                    return false;
                }
            }
            //Print Success Mapping
            //System.out.println(HM);
            return true;
        } else {
            //Length not matching
            return false;
        }

    }

    public static boolean lengthCheck(String s1, String s2){
        if(s1.length() != s2.length()){
            //System.out.println("Length doesn't match");
            return false;
        } else {
            return true;
        }
    }
}
