// Update Bit

// if oper == 1 -> set | if oper==0 -> clear

import java.util.*;
 
public class UpadteBit{
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);

        int oper = scan.nextInt();
        int n =5; // 0101  --> 0111 = 7
        int position =1 ;
        int bitmask = 1<<position;

        if(oper==1){
            System.out.println(bitmask|n);
        }
        else{
            int newBitMask = ~(bitmask);

            System.out.println(bitmask&n);
        }

 
}
}