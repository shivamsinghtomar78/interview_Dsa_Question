/*
Approach: brute force
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

/*
Approach:  optimised sol
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int x) {
        int n=flowerbed.length;
        if(x==0) return true;
        for(int i=0;i<n;i++){
            if(flowerbed[i]==0){
                boolean leftEmpty= (i==0) || (flowerbed[i-1]==0);
                boolean rightEmpty=(i==n-1) || (flowerbed[i+1]==0);
                if(leftEmpty && rightEmpty){
                    flowerbed[i]=1;
                    x--;
                    if(x==0) return true;
                }
            }
        }
        return false;
    }
}
