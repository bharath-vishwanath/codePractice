import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        if (nums.length == 0) return 0;

        for (int num: nums){
            seen.add(num);
        }

        int i = 0;
        for (int num: seen){
            nums[i++] = num;
        }
        System.out.println(seen);
        System.out.println(Arrays.toString(nums));
        return seen.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 2, 2, 3, 3, 4}));
    }
}