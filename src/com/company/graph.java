package com.company;

import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import javax.swing.*;

/**
 * Created by shadaziz on 4/22/17.
 */
public class graph {
    private final WeightedGraph<Integer, DefaultWeightedEdge> g = new SimpleDirectedWeightedGraph<Integer, DefaultWeightedEdge>(DefaultWeightedEdge.class);

    public void addVertex(Integer name) {
        g.addVertex(name);
    }

    public void addEdge(Integer v1, Integer v2) {
        g.addEdge(v1, v2);
    }

    public DefaultWeightedEdge getEdge(Integer v1, Integer v2) {
        return g.getEdge(v1, v2);
    }

    public double getEdgeWeight(DefaultWeightedEdge e) {
        return g.getEdgeWeight(e);
    }

    public void setEdgeWeight(DefaultWeightedEdge e, double v) {
        g.setEdgeWeight(e, v);
    }
}
