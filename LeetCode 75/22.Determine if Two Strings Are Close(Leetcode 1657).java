/*
Approach:brute force ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public boolean closeStrings(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        if(m!=n) return false;
        int [] freq1=new int [26];
        int [] freq2=new int [26];
        for(int i=0;i<m;i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            freq1[ch1-'a']++;
            freq2[ch2-'a']++;
        }
        for(int i=0;i<26;i++){
            if((freq1[i]!=0 && freq2[i]!=0) || (freq1[i]==0 && freq2[i]==0))
            continue;

            return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1,freq2);
    }
}

