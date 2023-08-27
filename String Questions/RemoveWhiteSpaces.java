// Remove whitespaces from the string 

import java.util.*;
 
public class RemoveWhiteSpaces{
    public static void main(String[] args){
 
        // Appraoch 1 
            String str = "He l l     o";
            // String x = str.replaceAll(" ","");
            // System.out.println(x);


        // Approach 2 
            String s = "";
            char[] arr = str.toCharArray();

            for(int i=0;i<arr.length;i++){
                if(arr[i]== ' '){
                    continue;
                }
                else{
                    s+=arr[i];
                }
            }
 
            System.out.println(s);
}
}