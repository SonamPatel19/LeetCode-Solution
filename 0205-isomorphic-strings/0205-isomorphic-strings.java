class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
          HashMap<Character,Character>map=new HashMap<>();
          HashMap<Character, Character> reverse = new HashMap<>();
          for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
           char ch2=t.charAt(i);
            if(map.containsKey(ch1)&& map.get(ch1)!=ch2){
                return false;
            }
             if(reverse.containsKey(ch2) && reverse.get(ch2) != ch1) {
                return false;
            }
            map.put(ch1,ch2);
            reverse.put(ch2,ch1);
          }
          return true;
    }
}