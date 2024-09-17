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



/*
Approach:brute force ;
Time complexity:O(N2);
Space complexity:O(N); */

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;

        // Count occurrences of each row
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        // Check each column against the row map
        for (int j = 0; j < n; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = grid[i][j];
            }
            String columnStr = Arrays.toString(column);
            count += rowMap.getOrDefault(columnStr, 0);
        }

        return count;
    }
}
