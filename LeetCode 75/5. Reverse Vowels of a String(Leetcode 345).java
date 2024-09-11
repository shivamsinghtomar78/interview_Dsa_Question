/*
Approach: Two poiner;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        char [] helper=s.toCharArray();
        while(i<j){
            if(!(isVowel(helper[i]))){
                i++;
            }
            else  if(!(isVowel(helper[j]))){
                j--;
            }
            else{
                char temp=helper[i];
                helper[i]=helper[j];
                helper[j]=temp;
                j--;
                i++;
            }
        }
        return new String(helper);
    }
}
