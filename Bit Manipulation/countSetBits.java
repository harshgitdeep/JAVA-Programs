import java.util.*;
 
public class countSetBits{
    public static void main(String[] args){

        int n=5;
        int sum =0;

        for(int i=1;i<=n;i++){
            int setbits = Integer.bitCount(i);
            sum+=setbits;
        }
 
        System.out.println(sum);
}
}