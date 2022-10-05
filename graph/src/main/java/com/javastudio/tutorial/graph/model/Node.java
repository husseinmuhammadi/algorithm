package com.javastudio.tutorial.graph.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Node<T> {
    private final T value;
    private final Set<Node<T>> neighbors = new HashSet<>();

    public Node(T value) {
        this.value = value;
    }

    public Node<T> addEdge(Node<T> dest){
        neighbors.add(dest);
        return this;
    }

    public T getValue() {
        return value;
    }

    public Set<Node<T>> getNeighbors() {
        return neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return value.equals(node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
