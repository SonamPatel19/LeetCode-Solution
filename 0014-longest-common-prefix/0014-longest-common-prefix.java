class Solution {
    public String longestCommonPrefix(String[] strs) {
            int n=strs.length;
            StringBuilder ans=new StringBuilder(strs[0]);
            if(n==0){
                return "";
            }
            int i=1;
            while(i<n){
                String str1=ans.toString();
                String str2=strs[i];
                char[] arr1 = str1.toCharArray();
                int n1=arr1.length;
                char[] arr2 = str2.toCharArray();
                int n2=arr2.length;
                int k=0;
                StringBuilder current=new StringBuilder();
                while(k<n1 && k<n2){
                    if(arr1[k]==arr2[k]){
                        current.append(arr1[k]);
                    }
                    else {
                        break;
                    }
                    k++;
                }
                ans=current;
                if (ans.length() == 0) {
                return "";
            }
                i++;
            }
             return ans.toString();
    }
}