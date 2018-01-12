package com.graph;

public class ShortestPath {
    private static final int V = 9;
    public static void main(String[] args) {
        int[][] graph = new int[][] {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        ShortestPath shortestPath = new ShortestPath();
        shortestPath.dijkstra(graph,0);
    }

    public void dijkstra(int[][] graph, int src){
        int[] dist = new int[V];
        boolean[] spSet = new boolean[V];

        for(int i = 0; i < V; i++){
            dist[i] = Integer.MAX_VALUE;
            spSet[i] = false;
        }

        dist[src] = 0;

        for(int count =0; count < V-1; count++){
            int u = getMinIndex(dist, spSet);
            spSet[u]= true;

            for(int v = 0; v < V; v++){
                if(!spSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist);
    }

    private void printSolution(int dist[])
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" tt "+dist[i]);
    }

    private int getMinIndex(int[] dist, boolean[] spSet) {
        int minIndex = -1;
        int min =  Integer.MAX_VALUE;
        for(int i = 0; i < V; i++){
            if(spSet[i] == false && dist[i] <= min){
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
