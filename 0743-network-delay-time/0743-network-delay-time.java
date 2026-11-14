class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
     public static void CreateGraph(ArrayList<Edge>[] graph,int[][] times){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<times.length;i++){
            int src=times[i][0]-1;
            int dest=times[i][1]-1;
            int wt=times[i][2];

            graph[src].add(new Edge(src,dest,wt));

        }
     } 
       
       static class Pair implements Comparable<Pair>{
          int n;
          int path;
          public Pair(int n,int path){
            this.n=n;
            this.path=path;
          }

          @Override
          public int compareTo(Pair p2){
            return this.path-p2.path;
          }
       }

     public static int findShort(ArrayList<Edge>[] graph,int src){
        int[] dist=new int[graph.length];
        for(int i=0;i<dist.length;i++){
                dist[i]=Integer.MAX_VALUE;
        }
         dist[src]=0;

         boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));
        
        while(!pq.isEmpty()){
                Pair curr=pq.remove();

            if(!vis[curr.n]){
                vis[curr.n]=true;

                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u] != Integer.MAX_VALUE &&
                        dist[u] + wt < dist[v]) {

                        dist[v] = dist[u] + wt;

                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
         int maxDist=0;

         for(int i=0;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }

            maxDist=Math.max(maxDist,dist[i]);
         }
         return maxDist;
     }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];

        CreateGraph(graph, times);

        int src = k - 1;

        return findShort(graph, src);
    }
}