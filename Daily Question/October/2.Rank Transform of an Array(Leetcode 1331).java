/*
Approach:HashMap ;
Time complexity:O(NlogN);
Space complexity:O(N); */


class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] helper = new int[n];
        for (int i = 0; i < n; i++) {
            helper[i] = arr[i];
        }
        Arrays.sort(helper);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(helper[i])) {
                map.put(helper[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
