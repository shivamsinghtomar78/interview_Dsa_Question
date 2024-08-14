/*
Approach-1:HashMap
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;
        if (fruits.length == 1) return 1;
        
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0;
        int j = 0;
        
        while (j < n) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if (map.size() <= 2) {
                max = Math.max(max, j - i + 1);
            }
            
            while (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
                i++;
            }
            
            j++;
        }

        return max;
    }
}
