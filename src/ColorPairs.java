import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> unpaired = new HashSet<>();
        int pairs = 0;
        for (int color : ar) {
            System.out.println(color);
            System.out.println(unpaired.add(color));
            if (!unpaired.add(color)) {  // If color already exists, add() returns false
                System.out.println(color);
                unpaired.remove(color);
                pairs++;
            }
        }
        return pairs;
    }

}

public class ColorPairs {
    public static void main(String[] args) throws IOException {
        Result.sockMerchant(9, List.of(10,10,20,30,30,20,10,40,50));
    }
}
