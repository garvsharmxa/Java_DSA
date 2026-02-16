package array;

import java.util.HashMap;

public class MajorityElementFrequencyCounting {
    public static void main(String[] args) {
        int[] nums = {10,12,11,9,6,19,11};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(map.size());
        System.out.println(map);
    }
}

