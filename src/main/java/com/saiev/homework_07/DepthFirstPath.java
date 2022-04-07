package com.saiev.homework_07;

public class DepthFirstPath extends FindPath{
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
    }

    public void dfs(Graph g, int v){
        dfsPrivate(g, v);
    }

    private void dfsPrivate(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfsPrivate(g, w);
            }
        }
    }
}
