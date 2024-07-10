/*
Approach-1:Iterative 
Time complexity:O(n);
Space complexity:O(1)
  */

class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for (String ch : logs) {
            if (ch.equals("../")) {
                if (count > 0) count--;
            }
            else if (ch.equals("./")) count = count;
            else count++;
        }
        return count;
    }
}

/*
Approach-2:Using Stack 
Time complexity:O(n);
Space complexity:O(n)
  */

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String operation:logs){
            if(operation.equals("../")){
                if(st.size()>0) st.pop();
            }
            else if(operation.equals("./")){

            }
            else{
                st.push(operation);
            }
        }
        return st.size();
    }
}
