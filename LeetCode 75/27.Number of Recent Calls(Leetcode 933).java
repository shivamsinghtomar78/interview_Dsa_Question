/*
Approach: Queue;
Time complexity:O(1);
Space complexity:O(N); */

 
class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Add the current request time
        requests.offer(t);
        
        // Remove outdated requests
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        
        // Return the number of requests in the last 3000 ms
        return requests.size();
    }
}
