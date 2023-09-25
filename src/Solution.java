//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "welcometojava\n" +
                            "3";
        Scanner scanner = new Scanner(mockInput);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        String[] stringArray = new String[s.length() - (k - 1)];
        for (int i = 0; i <= s.length() - k; i++) {
            stringArray[i] = s.substring(i, i + k);
        }
        
        Arrays.sort(stringArray);

        System.out.println(stringArray[0]);
        System.out.println(stringArray[stringArray.length - 1]);
    }
}
