// Get bit 

import java.util.*;
 
public class GetBit{
    public static void main(String[] args){
        
        int n = 15; 
        int position = 2;
 
        int bitmask = 1<<position;

        if((bitmask & n) == 0){
            System.out.print("Bit was 0");
        }
        else{
            System.out.print("Bit was 1");
        }
}
}

