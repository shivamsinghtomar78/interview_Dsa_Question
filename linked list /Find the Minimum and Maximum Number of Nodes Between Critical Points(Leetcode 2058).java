// Approach-1:Travel in whole list and store critical point and store distance in result
// T.c:O(n);
// S.c:O(n);

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next != null ? head.next.next : null;
        int[] result = new int[2];
        if (prev == null || curr == null || next == null) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        int n = 1;
        ArrayList<Integer> criticalPoints = new ArrayList<>();

        while (next != null) {
            if ((prev.val < curr.val && curr.val > next.val) ||
                (prev.val > curr.val && curr.val < next.val)) {
                criticalPoints.add(n);
            }
            prev = curr;
            curr = next;
            next = next.next;
            n++;
        }

        int size = criticalPoints.size();
        if (size < 2) {
            result[0] = -1;
            result[1] = -1;
        } else {
            int minDist = Integer.MAX_VALUE;
            for (int i = 1; i < size; i++) {
                minDist = Math.min(minDist, criticalPoints.get(i) - criticalPoints.get(i-1));
            }
            result[0] = minDist;
            result[1] = criticalPoints.get(size - 1) - criticalPoints.get(0);
        }

        return result;
    }
}


// Approach -2:finding max and min 
// T.c:O(n);
//S.c:O(n);

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left=head;
        ListNode mid=head.next;
        ListNode right=head.next!=null ?head.next.next:null;
        int first=-1;
        int last=-1;
        int idx=1;
        int []arr={-1,-1};
        int minDistance=Integer.MAX_VALUE;
        while(right!=null){
            if((mid.val>left.val && mid.val>right.val) || (mid.val<left.val && mid.val<right.val) ){
                if(first==-1) first=idx;
                if(last!=-1){
                    int dist=idx-last;
                    minDistance=Math.min(minDistance,dist);
                }
                last=idx;
            }
            idx++;
            left=left.next;
            mid=mid.next;
            right=right.next;
        }
        if(first==last) return arr;
        int maxDistance=last-first;
        arr[0]=minDistance;
        arr[1]=maxDistance;

        return arr;
        
    }
}
