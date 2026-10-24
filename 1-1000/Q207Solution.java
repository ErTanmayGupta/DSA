import java.util.*;
class Q207Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] prerequisites = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                prerequisites[i][j] = sc.nextInt();
            }
        }

        System.out.println(canFinish(num, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[0]).add(pre[1]);
        }

        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(visited[i] == 0){
                if(dfs(adj , visited , i)){
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj ,int[] visited , int i){
        if(visited[i] == 1) return true;
        if(visited[i] == 2) return false;

        visited[i] = 1;

        for(int nbr : adj.get(i)){
            if(dfs(adj , visited , nbr)){
                return true;
            }
        }

        visited[i] = 2;
        return false;
    }
}