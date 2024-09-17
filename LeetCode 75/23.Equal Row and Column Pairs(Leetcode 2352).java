/*
Approach:brute force ;
Time complexity:O(N^3);
Space complexity:O(n); */

class Solution {
    public int equalPairs(int[][] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int [] arr1=new  int[n];

            for (int j = 0; j < n; j++) {
                arr1[j]=arr[i][j];
            }
            for (int j = 0; j < n; j++) {
                int [] arr2=new  int[n];
                for (int k = 0; k < n; k++) {
                     arr2[k]=arr[k][j];
                }
                if (Arrays.equals(arr1, arr2))
                    count++;
            }
        }
        return count;
    }
}

