// Code for clear bit

// 1110   clear third bit 
// 1010
import java.util.*;
 
public class ClearBit{
    public static void main(String[] args){

       int n = 5; //0101
       int position = 2;
 
       int bitmask = 1<<position;
       bitmask = ~(bitmask);


        System.out.println((bitmask&n));
}
}

