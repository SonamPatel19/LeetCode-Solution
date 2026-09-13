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
        boolean result=Arrays.equals(arr,arr1);
        if(result){
            return true;
        }
        return false;
    }
}