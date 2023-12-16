package Week13;
import java.util.*;
public class Prims {
    static class Edge implements Comparable<Edge> {
        int v;
        int wt;
        Edge(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
        public int compareTo(Edge other) {
            return this.wt - other.wt;
        }
    }

    public static int prims(int n, List<List<Integer>> edges, int start) {
        // Write your code here
        List<List<Edge>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Edge>());
        }
        for(int i = 0; i < edges.size(); i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            int wt = edges.get(i).get(2);
            adj.get(u).add(new Edge(v, wt));
            adj.get(v).add(new Edge(u, wt));
        }
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(1, 0));
        boolean[] marked = new boolean[n + 1];
        int res = 0;
        while(!pq.isEmpty()) {
            Edge node = pq.poll();
            int v = node.v;
            int wt = node.wt;
            if(marked[v]) {
                continue;
            }
            res += wt;
            marked[v] = true;
            for(Edge i : adj.get(v)) {
                if(!marked[i.v]) {
                    pq.add(new Edge(i.v, i.wt));
                }
            }
        }
        return res;
    }
}
