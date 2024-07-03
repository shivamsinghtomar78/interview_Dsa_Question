/*
Approach-1:using extra stack;
Time complexity:O(1);
Time complexity:O(n); */

class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
        
    }
    
    public void pop() {
        st.pop();
        min.pop();
        
    }
    
    public int top() {
      return  st.peek();
        
    }


/*
Approach-2:using not extra stack;
Time complexity:O(1);
Time complexity:O(1); */


class MinStack {
    Stack<Long> st=new Stack<>();
    long min=-1;

    public MinStack() {
        
    }
    
    public void push(int  val) {
        long x=(long)val;
         if(st.isEmpty()){
            st.push(x);
            min=x;
         }
         else if(x>=min){
            st.push(x);
         }
         else{
            st.push(2*x-min);
            min=x;
         }
    }
    
    public void pop() {
         if(st.isEmpty()) return ;
         else if(st.peek()>=min) st.pop();
         else if(st.peek()<min){
            long oldMin=2*min-st.peek();
            min=oldMin;
            st.pop();
         }
        
    }
    
    public int top() {
      if(st.isEmpty()) return -1;
      long q=st.peek();
      if(q>=min) return (int)(q);
     if(q<min) return (int)min;
return 0;
        
    }
    
    public int getMin() {
         if(st.isEmpty()) return -1;
         return (int)min;
    }
}    
    
   
