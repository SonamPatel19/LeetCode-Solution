class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i],map.get(nums[i])+1);
            // }
            // else{
            //     map.put(nums[i],1);
            //  }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         Set<Integer>keySet=map.keySet();
         for(Integer key:keySet){
            if(map.get(key)>n/3){
                ans.add(key);
            }
         }
          return ans;
    }
}