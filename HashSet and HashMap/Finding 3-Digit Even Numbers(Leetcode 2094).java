/*
Approach-1:HashSet and using ArrayList;
Time complexity:O(N+M);
Space complexity:O(N+M); */

class Solution {
    public int[] findEvenNumbers(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);

            }
            else map.put(ele,1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=100;i<=999;i+=2){
            int x=i;
            int c=x%10; x/=10;
             int b=x%10; x/=10;
              int a=x;
              if(map.containsKey(a)){
                int aFreq=map.get(a);
                map.put(a,aFreq-1);
                if(aFreq==1) map.remove(a);
              if(map.containsKey(b)){
                int bFreq=map.get(b);
                map.put(b,bFreq-1);
                if(bFreq==1) map.remove(b);
              if(map.containsKey(c)){
                 ans.add(i);
              }
              map.put(b,bFreq);

              }
              map.put(a,aFreq);
              }
        }
        int [] ans2=new int[ans.size()];
        for(int i=0;i<ans2.length;i++){
            ans2[i]=ans.get(i);
        }
        return ans2;
 }
}
