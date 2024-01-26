class Solution {
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        //this is the overall visisted array
        int[]vis=new int[v];
        //this is current path of traversing graph
        //if the child node is visited and is a part of the current path then the cycle exits
        int[]pathvis=new int[v];
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                boolean b=dfs(i,adj,vis,pathvis);
                if(b==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i,ArrayList<ArrayList<Integer>> adj, int[]vis, int[]pathvis){
        vis[i]=1;pathvis[i]=1;                                                                                                                                                   
        boolean b=false;
        for(int j=0;j<adj.get(i).size();j++){
            int dest=adj.get(i).get(j);
            //if destination node is not visisted the go to that node
            if(vis[dest]==0){
                b=dfs(dest,adj,vis,pathvis);
                if(b==true){
                    break;
                }
            }
            //if the destiantion is visited and contains in the current path then return true
            else{
                if(pathvis[dest]==1){
                    b=true;break;
                }
            }
        }
        pathvis[i]=0;
        return b;
    }
}
