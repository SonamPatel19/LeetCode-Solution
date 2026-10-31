class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        int maxfreq=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
        }

        List<Character>bucket[]=new ArrayList[maxfreq+1];
        for(int i=0;i<=maxfreq;i++){
            bucket[i]=new ArrayList<>();
        }
         
         for(Map.Entry<Character,Integer>entry:map.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
         }

         StringBuilder ans=new StringBuilder();

         for(int freq=maxfreq;freq>0;freq--){
            for(char ch:bucket[freq]){
                for(int i=0;i<freq;i++){
                    ans.append(ch);
                }
            }
         }
         return ans.toString();
    }
}