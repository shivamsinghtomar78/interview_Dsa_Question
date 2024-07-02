/*
Approach-1:Three pointer 
Time complexity :O(n);
Space complexity:O(1); */


class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=1;
        int k=2;
        if(n<3) return false;
        while(k<n){
            if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0){  
                return true;
            } 
            i++;
            j++;
            k++;
        }
        return false;
        
    }
}

/*
Approach-2:Counting 
Time complexity :O(n);
Space complexity:O(1); */



  
