package code.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouzhihua
 * @date 2019/10/12 14:05
 * @description q1
 * @since 2019-10-12
 **/
public class q1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            hash.put(target - nums[i], i);
        }
        return indexs;
    }

    public static void main(String args[]) {
        int[] nums = {2, 11, 7, 15};
        System.out.println(twoSum(nums, 9)[0]);
        System.out.println(twoSum(nums, 9)[1]);

    }

}
