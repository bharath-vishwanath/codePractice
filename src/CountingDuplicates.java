import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String inputText = text.toLowerCase();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : inputText.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println(charCount);

        if (inputText == null || inputText.isEmpty()) {
            return 0;
        }

        int duplicateCount = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdeaB"));
    }
}
