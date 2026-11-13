class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for(int i=0; i<numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] p : prerequisites){
            graph[p[1]].add(p[0]);
        }

        int vis[] = new int[numCourses];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            if(vis[i] == 0){
                if(!dfs(i, graph, vis, ans)){
                    return new int[0];
                }
            }
        }

        Collections.reverse(ans);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean dfs(int curr, ArrayList<Integer>[] graph,
                       int vis[], ArrayList<Integer> ans){

        vis[curr] = 1;

        for(int neigh : graph[curr]){
            if(vis[neigh] == 1){
                return false;
            }

            if(vis[neigh] == 0){
                if(!dfs(neigh, graph, vis, ans)){
                    return false;
                }
            }
        }

        vis[curr] = 2;
        ans.add(curr);

        return true;
    }
}