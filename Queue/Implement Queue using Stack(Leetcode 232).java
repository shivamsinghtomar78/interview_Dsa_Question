/*
Approach-1 :Using two Stack  and push efficient 
push:
Time Complexity: O(1)
Space Complexity: O(1)
pop:
Time Complexity: O(n)
Space Complexity: O(n)
peek:
Time Complexity: O(n)
Space Complexity: O(n)
empty:
Time Complexity: O(1)
Space Complexity: O(1) */


class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.add(x);
        
    }
    
    public int pop() {
         while(st.size()>1){
            helper.add(st.pop());
         }
         int val=st.pop();
         while(!helper.isEmpty()){
            st.add(helper.pop());
         }
         return val;
        
    }
    
    public int peek() {
        while(st.size()>1){
            helper.add(st.pop());
         }
         int val=st.pop();
         st.add(val);
         while(!helper.isEmpty()){
            st.add(helper.pop());
         }
         return val;
        
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
        
    }
}
