/*
Approach: HashSet and HashMap ;
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int key:map.keySet()){
            set.add(map.get(key));
        }
        if(map.size()==set.size()) return true;
        else return false;
    }
}
