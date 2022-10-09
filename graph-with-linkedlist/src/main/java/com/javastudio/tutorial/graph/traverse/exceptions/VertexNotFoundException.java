package com.javastudio.tutorial.graph.traverse.exceptions;

public class VertexNotFoundException extends RuntimeException {
    public VertexNotFoundException() {
        super();
    }

    public VertexNotFoundException(String message) {
        super(message);
    }
}
