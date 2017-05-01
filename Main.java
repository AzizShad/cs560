

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
        
        //------------------------------------
        int start = 226; //starting point in graph
        //start already declared on top
        int end = 8;
        int v;
        int w;
        int weight;
        int dist;
        int maxVertices = 233;
        boolean intree[] = new boolean[maxVertices + 1];
        int distance[] = new int[maxVertices + 1];
        int parent[] = new int[maxVertices + 1];
        
        for(int i=1; i <= maxVertices; i++){ //Initializing all array contents
        	intree[i] = false;
        	distance[i] = Integer.MAX_VALUE; 
        	parent[i] = -1;
        }
        distance[start] = 0;
        v = start;
        
        while(!intree[v]){
        	intree[v] = true;

        	//System.out.println("parent: " + parent[v]);
        	//System.out.println("v: " + v);
        	
        	
        	//Finds value of current hex
            //if(gr.containsEdge(gr.getEdge(v+15, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(v+15, v)));
            //}
            //else if(gr.containsEdge(gr.getEdge(start-8, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(start-8, v)));
            //}
            //else if(gr.containsEdge(gr.getEdge(v-7, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(v-7, v)));
            //}
            //else if(gr.containsEdge(gr.getEdge(v+7, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(v+7, v)));
            //}
            //else if(gr.containsEdge(gr.getEdge(v+8, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(v+8, v)));
            //}
            //else if(gr.containsEdge(gr.getEdge(start-15, v))){
            	//System.out.println("\t\tCURRENT: " + gr.getEdgeWeight(gr.getEdge(start-15, start)));
            //}
        	if(gr.containsEdge(gr.getEdge(v, v-15))){//if has edge on top
             	//System.out.println("\t\ttop: " + gr.getEdgeWeight(gr.getEdge(v,v-15 )));
             	w = v - 15;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v-15));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             if(gr.containsEdge(gr.getEdge(v, v-8))){//if has edge on top left
             	//System.out.print("top left: " + gr.getEdgeWeight(gr.getEdge(v, v-8)));
             	w = v - 8;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v-8));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             if(gr.containsEdge(gr.getEdge(v, v-7))){//if has edge on top right
             	//System.out.println("\t\t\ttop right: " + gr.getEdgeWeight(gr.getEdge(v, v-7)));
             	w = v - 7;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v-7));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             if(gr.containsEdge(gr.getEdge(v, v+7))){
             	//System.out.print("bottom left: " + gr.getEdgeWeight(gr.getEdge(v,v+7 )));
             	w = v + 7;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v+7));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             if(gr.containsEdge(gr.getEdge(v, v+8))){
             	//System.out.println("\t\tbottom right: " + gr.getEdgeWeight(gr.getEdge(v, v + 8)));
             	w = v + 8;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v+8));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             if(gr.containsEdge(gr.getEdge(v, v+15))){
             	//System.out.println("\t\tbottom: " + gr.getEdgeWeight(gr.getEdge( v,v+15)));
             	w = v + 15;
             	weight = (int)gr.getEdgeWeight(gr.getEdge(v, v+15));
             	if(distance[w]> (distance[v] + weight)){
             		distance[w] = distance[v] + weight;
             		parent[w] = v;
             	}
             }
             v = 1;
             dist = Integer.MAX_VALUE;
             for(int i = 1; i<=maxVertices; i++){
            	 if(!intree[i] && (dist > distance[i])){
            		 dist = distance[i];
            		 v = i;
            	 }
             }
        }
        //Backtracking from end(8) to start(226) to get path
        int f = end;
        int i = 0;
        int path[] = new int[start];
        do{
        	path[i] = f;
        	if (parent[f] == start){
        		path[i++] = f;
        		path[i++] = parent[f];
        	}
        	f = parent[f];
        	i++;
        }while(f != start);
        
        //prints the path from start to end
		for(int t = i-2; t>=0; t--) {
		System.out.println(path[t]);
		}
		//adds the weights of vertices together to get cost path
		double pathcost = 0;
		for(int r=0; r <= i-2; r++){
			if (gr.containsEdge(gr.getEdge(path[r]+7,path[r])))
				pathcost += gr.getEdgeWeight(gr.getEdge(path[r]+7,path[r]));
			 else 
				pathcost += gr.getEdgeWeight(gr.getEdge(path[r]-7,path[r]));
			
		}

        System.out.println("MINIMAL-COST PATH COSTS: " + pathcost);  
    }
}
