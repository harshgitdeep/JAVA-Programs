// Code for set bit 
import java.util.*;
 
public class SetBit{
    public static void main(String[] args){
        
       int n = 5; 
       int position = 1;
 
       int bitmask = 1<<position;

        System.out.println(bitmask|n);
}
}

