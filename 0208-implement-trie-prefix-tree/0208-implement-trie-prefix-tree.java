class Trie {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }  
       public static Node root=new Node();

    public Trie() {
        root=new Node();
    }
    public void insert(String word) {
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
    
    public boolean search(String word) {
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int indx=word.charAt(level)-'a';
            if(curr.children[indx]==null){
                return false;
            }
            curr=curr.children[indx];
        }
        return curr.eow==true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;

        for(int level=0;level<prefix.length();level++){
            int indx=prefix.charAt(level)-'a';
            if(curr.children[indx]==null){
                return false;
            }
            curr=curr.children[indx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */