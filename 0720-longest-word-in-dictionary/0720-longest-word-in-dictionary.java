class Solution {
     static class Node{
        Node[] children=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
     
    public static Node root=new Node();
    public static String ans="";
    public static void Insert(String word){
        Node curr=root;

        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(curr.children[indx]==null){
                curr.children[indx]=new Node();
            }
            curr=curr.children[indx];
        }
        curr.eow=true;
    }
    public static void Longestword(Node root,StringBuilder temp){
          if(root==null){
            return;
          }

          for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                Longestword(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
          }
     }
    public String longestWord(String[] words) {
        ans="";
        root=new Node();
        for(int i=0;i<words.length;i++){
            Insert(words[i]);
        }

        Longestword(root,new StringBuilder(""));
        return ans;
    }

}