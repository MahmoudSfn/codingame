import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int maxMountainH = 0; // 0 - 9
            int maxMountainX = 0; // 0 - 7

            for (int i = 0; i < 8; i++) { // scan for the next highest mountain
                int mountainH = in.nextInt(); 
                
                if (maxMountainH <= mountainH) {
                    maxMountainH = mountainH;
                    maxMountainX = i;
                }
            }

            System.out.println(maxMountainX);

        }
    }
}
