package com.company;

import org.jgrapht.graph.DefaultWeightedEdge;
import sun.security.provider.certpath.Vertex;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int[] storage;

        //Need a file parser that takes the file and puts them into a 1d array of ints
        //array into a graph
        //algorithm save fastest path to a queue
        //print fastest route and print cost
        //end
        storage = fileParser.parse();
        graph gr = grapher.create(storage);
    }
}
