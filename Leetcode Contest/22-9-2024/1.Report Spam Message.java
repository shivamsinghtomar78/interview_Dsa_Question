/*Approach:HashSet ;
Time complexity:O(n);
Space Complexity:O(n)*/

  class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> bannedSet = new HashSet<>();
        int count = 0;
        
        for (String word : bannedWords) {
            bannedSet.add(word);
        }
        
        for (String word : message) {
            if (bannedSet.contains(word)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
}

/*Approach:HashMap ;
Time complexity:O(n);
Space Complexity:O(n)*/

class Solution {
    public boolean reportSpam(String[] arr1, String[] arr2) {
         HashMap<String ,Integer> map1=new HashMap<>();
         HashMap<String ,Integer> map2=new HashMap<>();

         for(String key:arr1){
            if(map1.containsKey(key)){
                int freq=map1.get(key);
                map1.put(key,freq+1);
            }
            else map1.put(key,1);
         }
         for(String key:arr2){
            if(map2.containsKey(key)){
                int freq=map2.get(key);
                map2.put(key,freq+1);
            }
            else map2.put(key,1);
         }


         int count=0;
         for(String key:map1.keySet()){
            if(map2.containsKey(key)){
                
                count+=map1.get(key);
            }
         }
         if(count>=2) return true;
         else return false;

}
}


