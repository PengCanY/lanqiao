package other.four;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int longestConsecutive(int[] nums) {
        // 检查输入数组是否为空或为null
        if (nums == null || nums.length == 0) {
            return 0; // 返回0表示没有连续子集
        }
        //无序且唯一
        Set<Integer> numSet = new HashSet<>(nums.length);
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // 如果当前数字的前一个不存在
                int current = num;
                int length = 1;
                // 向右扩展连续子集
                while (numSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                // 更新最长连续子集的长度
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int result = longestConsecutive(nums);
        System.out.println(result); // 输出3，因为最长连续子集是[4, 5, 6]
    }
}
