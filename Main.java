

import org.jgrapht.graph.DefaultWeightedEdge;
//import sun.security.provider.certpath.Vertex;

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
        
        //Looks at the values at edges of a hex(start)
        int start = 1;
        
        if(gr.containsEdge(gr.getEdge(start, start+15))){
        	System.out.println("\t\ttop: " + gr.getEdgeWeight(gr.getEdge(start,start+15 )));
        }
        if(gr.containsEdge(gr.getEdge(start, start-8))){
        	System.out.print("top left: " + gr.getEdgeWeight(gr.getEdge(start, start-8)));
        }
        if(gr.containsEdge(gr.getEdge(start, start-7))){
        	System.out.println("\t\t\ttop right: " + gr.getEdgeWeight(gr.getEdge(start, start-7)));
        }
        //Finds value of current hex
        if(gr.containsEdge(gr.getEdge(start+15, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start+15, start)));
        }
        else if(gr.containsEdge(gr.getEdge(start-8, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start-8, start)));
        }
        else if(gr.containsEdge(gr.getEdge(start-7, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start-7, start)));
        }
        else if(gr.containsEdge(gr.getEdge(start+7, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start+7, start)));
        }
        else if(gr.containsEdge(gr.getEdge(start+8, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start+8, start)));
        }
        else if(gr.containsEdge(gr.getEdge(start-15, start))){
        	System.out.println("\t\tcurrent: " + gr.getEdgeWeight(gr.getEdge(start-15, start)));
        }
        //end else if
        if(gr.containsEdge(gr.getEdge(start, start+7))){
        	System.out.print("bottom left: " + gr.getEdgeWeight(gr.getEdge(start,start+7 )));
        }
        if(gr.containsEdge(gr.getEdge(start, start+8))){
        	System.out.println("\t\tbottom right: " + gr.getEdgeWeight(gr.getEdge(start, start + 8)));
        }
        if(gr.containsEdge(gr.getEdge(start, start-15))){
        	System.out.println("\t\tbottom: " + gr.getEdgeWeight(gr.getEdge( start,start-15)));
        }
        
    }
}
