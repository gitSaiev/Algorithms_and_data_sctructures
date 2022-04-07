package com.saiev.homework_07;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,7);
        graph.addEdge(7,9);
        graph.addEdge(1,2);
        graph.addEdge(7,2);
        graph.addEdge(9,3);
        graph.addEdge(3,7);
        graph.addEdge(1,5);
        graph.addEdge(5,4);
        graph.addEdge(4,9);
        graph.addEdge(3,9);

        BreadthFirstPath breadthFirstPath = new BreadthFirstPath(graph, 7);
        System.out.println(breadthFirstPath.hasPathTo(4));
        System.out.println(breadthFirstPath.pathTo(4));
    }
}
