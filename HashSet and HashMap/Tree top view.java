/*
Approach-1:Bfs and hashmap;
Time complexity:O(N);
Space complexity:O(N);
Problem:https://www.hackerrank.com/challenges/tree-top-view/problem?isFullScreen=false  
*/

 public static class pairs{
        Node node;
        int level;
        pairs(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void topView(Node root) {
        HashMap<Integer,Integer> map =new HashMap<>();
        Queue<pairs> q=new LinkedList<>();
        q.add(new pairs(root,0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(q.size()>0){
            pairs temp=q.remove();
            Node n=temp.node;
            int lvl=temp.level;
            min=Math.min(min,lvl);
            max=Math.max(max,lvl);
            if(!map.containsKey(lvl)) map.put(lvl,n.data);
            if (n.left!=null) q.add(new pairs(n.left,lvl-1));
            if (n.right!=null) q.add(new pairs(n.right,lvl+1));
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i)+" ");
        }

    }
