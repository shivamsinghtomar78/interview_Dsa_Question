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


/*
Approach:HashSet ;
Time complexity:O(N);
Space complexity:O(1); */

lass Solution {
    public boolean closeStrings(String word1, String word2) {
        // Step 1: Check if both words are of the same length
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: Check if both words have the same set of characters
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        for (char c : word1.toCharArray()) {
            set1.add(c);
        }
        
        for (char c : word2.toCharArray()) {
            set2.add(c);
        }

        if (!set1.equals(set2)) {
            return false;
        }

        // Step 3: Count the frequency of each character in both words
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Step 4: Sort the frequency arrays and compare
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Step 5: Check if sorted frequencies are equal
        return Arrays.equals(freq1, freq2);
    }
}


