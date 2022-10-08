package com.javastudio.tutorial.graph.model;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    private final HashMap<Node, LinkedList<Node>> adjacencyMap;
    private final boolean directed;

    public Graph(boolean directed) {
        this.adjacencyMap = new HashMap<>();;
        this.directed = directed;
    }

    public static class Node {
        private final int value;
        private boolean visited;

        public Node(int value) {
            this.value = value;
            this.visited = false;
        }

        public void visit(){
            this.visited = true;
        }

        public void unvisit(){
            this.visited=false;
        }

        public int getValue() {
            return value;
        }

        public boolean isVisited() {
            return visited;
        }
    }
}
