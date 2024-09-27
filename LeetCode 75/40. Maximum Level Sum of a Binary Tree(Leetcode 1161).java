/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(N); */

 class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevel = level;
            }
            
            level++;
        }
        
        return maxLevel;
    }
}


/*
Approach: Binary tree;
Time complexity:O(N);
Space complexity:O(N); */



class Solution {
    
    private Map<Integer, Integer> mp;
    
    public void DFS(TreeNode root, int currLevel) {
        if (root == null)
            return;
        
        mp.put(currLevel, mp.getOrDefault(currLevel, 0) + root.val);
        
        DFS(root.left, currLevel + 1);
        DFS(root.right, currLevel + 1);
    }
    
    public int maxLevelSum(TreeNode root) {
        mp = new HashMap<>();
        
        DFS(root, 1);
        
        int maxSum = Integer.MIN_VALUE;
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int level = entry.getKey();
            int sum = entry.getValue();
            
            if (sum > maxSum) {
                maxSum = sum;
                result = level;
            }
        }
        
        return result;
    }
}
