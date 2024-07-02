/*
Approach -1:brute force
Time complexity:O(n*m);
Space complexity:O(n); */

class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if (n > m) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr2[i] == arr1[j]) {
                        ans.add(arr2[i]);
                        arr1[j]=-1;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr1[i] == arr2[j]) {
                        ans.add(arr1[i]);
                        arr2[j]=-1;
                        break;
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
