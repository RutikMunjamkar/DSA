class Solution {
    public int[] findOrder(int n, int[][] arr) {
        //Topological sort works on the directed Acyclic graph 
        HashMap<Integer,List<Integer>>hash=new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            List<Integer>list=hash.get(arr[i][1]);
            list.add(arr[i][0]);
            hash.put(arr[i][1],list);
        }
        boolean b=findCycle(n, hash);
        if(b==true){
            return new int[0];
        }
        Stack<Integer>stack=new Stack<>();
        int[]vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                topo(i,hash,stack,vis);
            }
        }
        int i=0;int[]res=new int[n];
        while(!stack.isEmpty()){
            int x=stack.pop();
            res[i]=x;
            i++;
        }
        return res;
    }
    public static void topo(int i, HashMap<Integer,List<Integer>>hash, Stack<Integer>stack, int[]vis){
        vis[i]=1;
        for(int j=0;j<hash.get(i).size();j++){
            int dest=hash.get(i).get(j);
            if(vis[dest]==0){
                topo(dest,hash,stack,vis);
            }
        }
        stack.push(i);
    }
    public static boolean findCycle(int n,HashMap<Integer,List<Integer>>hash){
        int[]vis=new int[n];
        int[]pathvis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(detectCycle(i, hash,vis,pathvis)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycle(int i,HashMap<Integer,List<Integer>>hash, int[]vis, int[]pathvis){
        pathvis[i]=1; vis[i]=1;boolean b=false;
        for(int j=0;j<hash.get(i).size();j++){
            int dest=hash.get(i).get(j);
            if(vis[dest]==0){
                b=detectCycle(dest,hash,vis,pathvis);
                if(b==true){
                    break;
                }
            }
            else{
                if(pathvis[dest]==1){
                    b=true;
                    break;
                }
            }
        }
        pathvis[i]=0;
        return b;
    }
}
