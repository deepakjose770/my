package com.deepak.graphs;

import java.util.ArrayList;
import java.util.Iterator;

//https://www.youtube.com/watch?v=zdAQ5iwdf2Q

public class GraphSearchOne {

    int V;
    ArrayList<Integer> adj[];

    GraphSearchOne(int noOfVertex) {
        V = noOfVertex;
        adj = new ArrayList[noOfVertex];
        for (int i = 0; i < noOfVertex; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y) {
        adj[x].add(y);
    }

    void breathFirstSearch(int sourcevertex) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[sourcevertex] = true;
        a1.add(sourcevertex);
        while (!a1.isEmpty()) {
            sourcevertex = a1.remove(0);
            System.out.print(sourcevertex + " ");
            Iterator i = adj[sourcevertex].iterator();
            while (i.hasNext()) {
                int n = (int) i.next();
                if(!visited[n]) {
                    visited[n] = true;
                    a1.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
