import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;
    private int[][] up;
    private int[] depth;
    private int LOG;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;
        LOG = (int) (Math.log(n) / Math.log(2)) + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        up = new int[n + 1][LOG];
        depth = new int[n + 1];
        dfs(1, 1, 0, adj);

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            if (u == v) {
                result[i] = 0;
            } else {
                int dist = getDist(u, v);
                result[i] = power(2, dist - 1);
            }
        }
        return result;
    }

    private void dfs(int u, int p, int d, List<List<Integer>> adj) {
        depth[u] = d;
        up[u][0] = p;
        for (int i = 1; i < LOG; i++) up[u][i] = up[up[u][i - 1]][i - 1];
        for (int v : adj.get(u)) if (v != p) dfs(v, u, d + 1, adj);
    }

    private int getLCA(int u, int v) {
        if (depth[u] < depth[v]) { int temp = u; u = v; v = temp; }
        for (int i = LOG - 1; i >= 0; i--) {
            if (depth[u] - (1 << i) >= depth[v]) u = up[u][i];
        }
        if (u == v) return u;
        for (int i = LOG - 1; i >= 0; i--) {
            if (up[u][i] != up[v][i]) { u = up[u][i]; v = up[v][i]; }
        }
        return up[u][0];
    }

    private int getDist(int u, int v) {
        return depth[u] + depth[v] - 2 * depth[getLCA(u, v)];
    }

    private int power(long base, int exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return (int) res;
    }
}