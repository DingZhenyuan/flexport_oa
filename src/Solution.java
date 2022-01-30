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

    // Almost palindrome
    public int palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        int res = 0;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                res += 2;
            left++;
            right--;
        }
        return res;
    }

    public void testPalindrome() {
        String str = "abcdcaa";
        System.out.println(palindrome(str));
    }

    // tile jumping
    public boolean jump(int[] tiles) {
        int next = tiles[0];
        if (next >= tiles.length - 1)
            return true;
        for (int i = 1; i < tiles.length; i++) {
            if (i > next)
                return false;
            next = Math.max(next, i + tiles[i]);
            if (next >= tiles.length - 1)
                return true;
        }
        return false;
    }

    public void testJump() {
        int[] t1 = new int[]{1, 2, 0, 0, 1};
        int[] t2 = new int[]{5, 0, 0, 0};
        System.out.println(jump(t1));
        System.out.println(jump(t2));
    }
}
