/*
Approach-1:HashMap:
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map1.containsKey(key)) {
                int freq = map1.get(key);
                map1.put(key, freq + 1);
            } else
                map1.put(key, 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map2.containsKey(key)) {
                int freq = map2.get(key);
                map2.put(key, freq + 1);
            } else
                map2.put(key, 1);
        }
        for (char key : map1.keySet()) {
            if (!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }
      
        return true;

    }
}
