/*
Approach:brute force ;
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        List<Character> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }

        while(!st.isEmpty()){
            if(st.peek()!='*') ans.add(st.pop());
            if( !st.isEmpty() && st.peek()=='*'){
                int count=0;
                while(st.peek()=='*'){
                    count++;
                    st.pop();
                }
                for(int i=0;i<count;i++){
                    if(st.peek()=='*') count+=2;
                    st.pop();
                }
            }
        }
        Collections.reverse(ans);
        String result="";
        for(int i=0;i<ans.size();i++){
            result+=ans.get(i);
        }
        return result;
        
    }
}
/*
Approach:Stack ;
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else st.pop();
        }
       StringBuilder ans=new StringBuilder();
       int n=st.size();

        for(int i=0;i<n;i++){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}

