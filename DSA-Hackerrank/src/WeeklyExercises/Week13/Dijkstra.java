package Week13;
import java.util.*;
public class Dijkstra {
    static class Edge implements Comparable<Edge> {
        int v;
        int e;
        Edge(int v, int e) {
            this.v = v;
            this.e = e;
        }
        public int compareTo(Edge other) {
            return this.e - other.e;
        }
    }

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        // Write your code here
        List<List<Edge>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Edge>());
        }

        for(List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }
        int[] d = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[s] = 0;
        boolean[] visited = new boolean[n + 1];
        int cnt = 0;
        while(cnt < n) {
            cnt++;
            int v = 0;
            int currentMin = Integer.MAX_VALUE;
            for(int i = 1; i <= n; i++) {
                if(!visited[i]) {
                    if(d[i] < currentMin) {
                        currentMin = d[i];
                        v = i;
                    }
                }
            }
            visited[v] = true;
            if(d[v] == Integer.MAX_VALUE) {
                break;
            }
            for(Edge it : adj.get(v)) {
                int u = it.v;
                int e = it.e;
                d[u] = Math.min(d[u], d[v] + e);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i == s) continue;
            if(d[i] < Integer.MAX_VALUE) {
                res.add(d[i]);
            } else {
                res.add(-1);
            }
        }
        return res;
    }

}
