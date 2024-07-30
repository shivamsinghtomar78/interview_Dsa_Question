/*
Approach-1:Brute force ;
Time complexity:O(N^2);
Space complexity:O(1);
*/
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 String ch1=words[i];
                 String ch2=words[j];
                if(ch1.charAt(0)==ch2.charAt(1) && ch1.charAt(1)==ch2.charAt(0)) count++;
            }
        }
        return count;
    }
}


/*
Approach-2:Brute force ;
Time complexity:O(N);
Space complexity:O(N);
*/

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev=reverse(words[i]);
            if(set.contains(rev)){
                count++;
            }
            else set.add(words[i]);
        } 
        return count ;
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
