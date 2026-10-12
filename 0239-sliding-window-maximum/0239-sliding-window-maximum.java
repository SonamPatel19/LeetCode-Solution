class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
          int n=nums.length;
          if(n==1){
            return nums;
          }
          ArrayList<Integer>ans=new ArrayList<>();
          Deque<Integer>q=new LinkedList<>();
          for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                 q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                   q.removeLast();
            }

            q.addLast(i);
            if(i>=k-1){
                ans.add(nums[q.peekFirst()]);
            }
          }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}