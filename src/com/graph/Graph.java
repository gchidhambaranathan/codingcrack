package com.graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by GChidhambaranathan on 12/25/2017.
 */
public class Graph {
    private Vertex vertices[];
    private int adjMatrix[][];
    private Stack<Integer> stack;
    private Queue<Integer> queue;
    private int vertexCount;
    public Graph(int vertexCount){
        this.vertexCount = vertexCount;
        vertices = new Vertex[vertexCount];
        adjMatrix = new int[vertexCount][vertexCount];
        for(int i = 0 ; i < vertexCount; i++){
            for(int j = 0; j < vertexCount; j++){
                adjMatrix[i][j] = 0;
            }
        }
        stack = new Stack();
        queue = new ArrayDeque<>();
    }
    public void addVertex(char label){
        Vertex newVertex = new Vertex(label);
        this.vertices[this.vertexCount++] = newVertex;
    }

    public void addEdge(int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.println(vertices[v].label);
    }

    public void dfs(){
        vertices[0].isVisted = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()){
            int v = getAdjUnvisited(stack.peek());
            if(v == -1){
                stack.pop();
            }else {
                vertices[v].isVisted = true;
                displayVertex(v);
                stack.push(v);
            }
        }

        //reset
        for(int i = 0; i < this.vertexCount ; i ++){
            vertices[i].isVisted = false;
        }
    }

    public void bfs(){
        vertices[0].isVisted = true;
        displayVertex(0);
        queue.add(0);
        int v2;
        while(!queue.isEmpty()){
            int v1 = queue.remove();
            while(getAdjUnvisited(v1) !=-1){
                v2 = getAdjUnvisited(v1);
                vertices[v2].isVisted = true;
                displayVertex(v2);
                queue.add(v2);
            }
        }

        //reset
        for(int i = 0; i < this.vertexCount ; i ++){
            vertices[i].isVisted = false;
        }
    }

    public int getAdjUnvisited(int v){
        for(int j = 0; j < this.vertexCount; j++){
            if(this.adjMatrix[v][j] == 1 && vertices[j].isVisted == false){
                return j;
            }
        }
        return -1;
    }
}

class Vertex {
    public char label;
    public boolean isVisted;

    public Vertex(char label){
        this.label = label;
    }
}
