import java.util.*;
        import java.math.BigDecimal;

public class BigDecimalDescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Skip the 'n' header
        if (sc.hasNextInt()) sc.nextInt();

        List<String> list = new ArrayList<>();

        // 2. Read all available data
        while (sc.hasNext()) {
            String input = sc.next();
            // Optional: Basic check to ensure it looks like a number
            // (Contains digits, a dot, or a minus sign)
            if (input.matches("-?\\d*\\.?\\d+")) {
                list.add(input);
            }
        }
        sc.close();

        // 3. Sort with a Safety Net
        list.sort((a, b) -> {
            try {
                BigDecimal valA = new BigDecimal(a);
                BigDecimal valB = new BigDecimal(b);
                return valB.compareTo(valA);
            } catch (NumberFormatException e) {
                // If something goes wrong, treat it as "equal" to avoid moving it
                return 0;
            }
        });

        // 4. Print results
        list.forEach(System.out::println);
    }
}