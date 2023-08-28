import java.util.*;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int num = 2; // Replace with the integer you want to count set bits for

        // Method number 1 
    int count = 0;
    while (num > 0) {
        count += num & 1;
        num >>= 1;
    }
    System.out.println(count);


            //Method 2
        // int setBitCount = Integer.bitCount(num);
        // System.out.println("Number of set bits in " + num + " is: " + setBitCount);
    }
}
