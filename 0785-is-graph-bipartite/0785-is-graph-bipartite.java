class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }

        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){//BFS
               q.add(i);
               col[i]=0;//yellow
               while(!q.isEmpty()){
                 int curr=q.remove();
                 for(int j=0;j<graph[curr].length;j++){
                    int dest=graph[curr][j];//e.dest
                    if(col[dest]==-1){
                        int nextcol=col[curr]==0? 1:0;
                        col[dest]=nextcol;
                        q.add(dest);
                    }
                    else if(col[dest]==col[curr]){
                        return false;
                    }
                 }
               }
            }
        }
        return true;

    }
}