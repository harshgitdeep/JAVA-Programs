// Sort the character of a string in alphabetical order

import java.util.*;
 
public class SortChar{
    public static void main(String[] args){

        String str = "java";
 
        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
}
}