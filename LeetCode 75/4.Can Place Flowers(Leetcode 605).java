/*
Approach: poiners;
Time complexity:O(N);
Space complexity:O(1); */
class Solution {
    public boolean canPlaceFlowers(int[] arr, int x) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        int k = 2;
        int count = 0;
        
        if (n == 1) {
            return (arr[0] == 0 && x <= 1) || (x == 0);
        }
        
        if (n > 1 && arr[0] == 0 && arr[1] == 0) {
            count++;
            arr[0] = 1;
        }
        
        while (k < n) {
            if (arr[i] == 0 && arr[j] == 0 && arr[k] == 0) {
                count++;
                arr[j] = 1;
            }
            i++;
            j++;
            k++;
        }
        
        if (n > 1 && arr[n-1] == 0 && arr[n-2] == 0) {
            count++;
        }
        
        return count >= x;
    }
}
