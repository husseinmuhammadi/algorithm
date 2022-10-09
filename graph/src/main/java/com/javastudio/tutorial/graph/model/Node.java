package com.javastudio.tutorial.graph.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Node<T> {
    private final T value;
    private final Set<Node<T>> neighbours = new HashSet<>();

    public Node(T value) {
        this.value = value;
    }

    public Node<T> addEdge(Node<T> dest){
        neighbours.add(dest);
        return this;
    }

    public T getValue() {
        return value;
    }

    public Set<Node<T>> getNeighbours() {
        return neighbours;
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
