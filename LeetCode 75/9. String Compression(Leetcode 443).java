/*
Approach: Two poiner;
Time complexity:O(N);
Space complexity:O(1); */

 class Solution {
    public int compress(char[] arr) {
        int n = arr.length;
        int i = 0;   
        int writeIndex = 0;   
        
        while (i < n) {
            char currentChar = arr[i];
            int count = 0;
             
            while (i < n && arr[i] == currentChar) {
                i++;
                count++;
            }
            
           
            arr[writeIndex++] = currentChar;
             
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    arr[writeIndex++] = c;
                }
            }
        }
        
    
        return writeIndex;
    }
}
