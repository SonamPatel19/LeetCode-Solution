class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String sorted=new String(arr);
        char[] arr1=t.toCharArray();
        Arrays.sort(arr1);
        String sorted1=new String(arr1);
        for(int i=0;i<n;i++){
                if(sorted.charAt(i)!=sorted1.charAt(i)){
                    return false;
                }
            }
        return true;
    }
}