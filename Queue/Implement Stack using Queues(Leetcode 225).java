/*
Approach-1 :Using one queue and push efficient 
push:
Time Complexity: O(1)
Space Complexity: O(1)
pop:
Time Complexity: O(n)
Space Complexity: O(1)
top:
Time Complexity: O(n)
Space Complexity: O(1)
empty:
Time Complexity: O(1)
Space Complexity: O(1) */


class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        
    }
    
    public int pop() {
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
        int val=q.remove();
        return val;
        
    }
    
    public int top() {
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
        int val=q.remove();
        q.add(val);
        return val;
        
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
    }
}


/*
Approach-2 :Using one queue and pop efficient 
push:
Time Complexity: O(n)
Space Complexity: O(1)
pop:
Time Complexity: O(1)
Space Complexity: O(1)
top:
Time Complexity: O(1)
Space Complexity: O(1)
empty:
Time Complexity: O(1)
Space Complexity: O(1) */

class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size()==0) q.add(x);
        else{
            q.add(x);
            for(int i=1;i<q.size();i++ )
            q.add(q.remove());
        }
        
    }
    
    public int pop() {
        return q.remove();
        
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
        
    }
}
