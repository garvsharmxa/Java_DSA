package array;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println();
    }
}
