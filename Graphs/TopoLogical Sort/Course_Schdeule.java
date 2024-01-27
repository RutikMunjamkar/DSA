
class Solution {
    public int[] findOrder(int n, int[][] arr) {
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
    }
    public static int topo(int i, HashMap<Integer,List<Integer>>hash, Stack<Integer>stack, int[]vis){
        vis[i]=1;
        for(int j=0;<hash.get(i).size();j++){
            int dest=hash.get(i).get(j);
        }
    }
    public static boolean findCycle(int n,HashMap<Integer,List<Integer>>hash){
        int[]vis=new int[n];
        int[]pathvis=new int[n];
        for(int 0;i<n;i++){
            if(vis[i]==0){
                if(i, detectCycle(hash,vis,pathvis)==true){
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
                if(pathvis[i]==1){
                    break;
                }
            }
        }
        pathvis[i]=0;
        return b;
    }
}
