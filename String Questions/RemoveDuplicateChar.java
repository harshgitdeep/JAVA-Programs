    // Remove duplicate characters from the string 

    import java.util.*;
    
    public class RemoveDuplicateChar{
        public static void main(String[] args){
    
            String str = "Programming";

            // ArrayList<Character> set = new ArrayList<>();    
            Set<Character> set = new LinkedHashSet();

            for(int i=0;i<str.length();i++){
                Character ele = str.charAt(i);
                // if(set.contains(ele)){
                //     continue;
                // }
                // else{
                        set.add(ele);
                // }
                
            }

            System.out.println(set);
    }
    }