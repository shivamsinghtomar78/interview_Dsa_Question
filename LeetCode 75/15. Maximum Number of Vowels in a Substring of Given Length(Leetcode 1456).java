/*
Approach: sliding window  ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        String help="aeiou";
        for(int i=0;i<help.length();i++ ){
            set.add(help.charAt(i));
        }
        int mx=Integer.MIN_VALUE;
        int count=0;
        for(int x=0;x<k;x++){
            if(set.contains(s.charAt(x))){
                count++;
            }
        }
        mx=Math.max(mx,count);
        int i=0;
        int j=k-1;
        while(j<n-1){
            if(set.contains(s.charAt(i))){
                count--;
            }
            if(set.contains(s.charAt(j+1))){
                count++;
            }
            mx=Math.max(mx,count);
            i++;
            j++;
        }
        return mx;

    }
}
