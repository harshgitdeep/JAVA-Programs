// Replace charcter with it's occurence in the string

// Input : OPENTEXT
// Output: OPEN1EX2

import java.util.*;
 
public class ReplaceWithOccurence{
    public static void main(String[] args){

        String str = "OPENTEXT";

        char[] arr = str.toCharArray();

        char toreplace = 'T';

        int count=0;
        for(int i =0;i<arr.length;i++ ){

            if(arr[i]==toreplace){
                count++;
                arr[i] = (char) ('0' + count);
                
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
 
}
}