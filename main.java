import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String s1 = "1231";
        String s2 = "321";
        System.out.println("Test Case 1: abc vs bcd");
        isOneToOne(s1,s2);
//        String s3 = "foo";
//        String s4 = "bar";
//        System.out.println("Test Case 2: foo vs bar");
//        System.out.println(isOneToOne(s3,s4));

    }

    public static void isOneToOne(String s1, String s2) {

        //Create 2 HashMap for each character in String 1 and String 2
        HashMap<String, Integer> S1Map = new HashMap<>();
        HashMap<String, Integer> S2Map = new HashMap<>();

        //Read each Character from both String and put into Char Array
        char[] S1Array = s1.toCharArray();
        char[] S2Array = s2.toCharArray();

        //Loop through Char Array and put into Hash Map
        for(char x : S1Array ){
            //Convert X int String
            String currentX = Character.toString(x);
            System.out.println(currentX);
            if(!S1Map.containsKey(currentX)){
                S1Map.put(currentX, 1);
            } else {
                System.out.println("Duplicate Found");
            }
        }

        System.out.println(S1Map);

//        //Loop through Char Array and put into Hash Map
//        for(char y : S2Array) {
//            String currentY = Character.toString(y);
//            for (Map.Entry<String, Integer> entry : S2Map.entrySet()) {
//                S2Map.put(currentY, 1);
//                System.out.println( "Current Key " + entry.getKey() );
//            }
//        }

//        if(S1Map.size() != S2Map.size()){
//            return false;
//        } else {
//            //TODO: Implement Condition check for 1to1 between 2 HashMap
//            return true;
//        }
    }
}
