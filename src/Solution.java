import java.util.HashSet;

public class Solution {
    // Duplicated number
    public int getMissNum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            if (set.contains(num))
                continue;
            set.add(num);
            sum += num;
        }
        return (1 + n) * n / 2 - sum;
    }

    public void testMissNum() {
        int[] nums = new int[]{4, 3, 3, 1};
        System.out.println(getMissNum(nums));
    }
}
