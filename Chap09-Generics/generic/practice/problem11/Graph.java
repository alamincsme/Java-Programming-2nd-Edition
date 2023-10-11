package com.alamin.chap09.generic.practice.problem11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<T> {
    private Map<T, Set<T>>  adjacencyList;
    private int numVertices;
    private int numEdges;

    public Graph() {
        this.adjacencyList = new HashMap<>();
        this.numVertices = 0;
        this.numEdges = 0;
    }

    public void addVertex(T vertex) {
        if (! adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new HashSet<>());
            numVertices++;
        }
    }

    public void addEdge(T vertex1, T vertex2) {
        if (! adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
            throw new IllegalArgumentException("Both vertices must be in the graph.");
        }
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
        numEdges++;
    }

    public void removeVertex(T vertex) {
        if (! adjacencyList.containsKey(vertex)) {
            return;
        }

        for (T adjancenVertex : adjacencyList.get(vertex)) {
            adjacencyList.get(adjancenVertex).remove(vertex);
            numEdges--;
        }

        adjacencyList.remove(vertex);
        numVertices--;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                ", numVertices=" + numVertices +
                ", numEdges=" + numEdges +
                '}';
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A","C");
        graph.addEdge("B","C");
        graph.addEdge("A","B");
        graph.removeVertex("A");
        System.out.println(graph);


    }
}
