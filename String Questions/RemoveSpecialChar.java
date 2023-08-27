//  Remove all special characters from the string 

import java.util.*;
 
public class RemoveSpecialChar{
    public static void main(String[] args){
 
        String str = "H&*#e(ll_o";

        String a = str.replaceAll("[^A-Za-z0-9]","");

        System.out.print(a);
 
}
}