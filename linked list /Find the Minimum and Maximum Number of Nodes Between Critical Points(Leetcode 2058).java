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

// Approach-3: 
// T.c:O(n);
// S.c:O(1);

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       int []ans={-1,-1};
        if(head.next.next==null) return ans;
        ListNode t1=head;
        ListNode mid=head.next;
        ListNode t2=head.next.next;
        ArrayList<Integer> list=new ArrayList<>();
        int count=2;
        while(t2!=null){
            if((mid.val>t1.val && mid.val>t2.val) || (mid.val<t1.val && mid.val<t2.val)) {
                 list.add(count);
            }
            count++;
            t1=t1.next;
            mid=mid.next;
            t2=t2.next;
        }
         int n=list.size();
          if(n==1){
            ans[0]=-1;
            ans[1]=-1; 
          }
          else if(n==2){
            ans[0]=list.get(1)-list.get(0);
            ans[1]=list.get(1)-list.get(0);
          }
          else if(n>2){
            int mn=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                mn=Math.min(mn,list.get(i)-list.get(i-1));
            }
            ans[0]=mn;
            ans[1]=list.get(n-1)-list.get(0);

          }
        return ans;
        
    }
}
