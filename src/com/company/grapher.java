package com.company;


/**
 * Created by shadaziz on 4/22/17.
 */
public class grapher {
    public static graph create(int[] storage){
        boolean is1,is2,is3,is4,is5,is6;
        graph gr = new graph();

        for(int i = 0; i < storage.length; i++){
            gr.addVertex(i+1);
        }

        for(int i = 0; i < storage.length; i++) {

            //This is checking if the sides can be connected.
            //      _1_
            //    6/   \2
            //    5\   /3
            //      ---
            //       4

            is1 = is2 = is3 = is4 = is5 = is6 = true;
            if (((i) <= 7)){
                is1 = is2 = is6 = false;
            }
            if(((i) <= 14)){
                is1 = false;
            }
            if(((i)%15 == 0)){
                is5 = is6 = false;
            }
            if(((i-7)%15 == 0)){
                is2 = is3 = false;
            }
            if((i>=218)){
                is4 = false;
            }
            if((i>=225)){
                is3 = is4 = is5 = false;
            }
            System.out.print((i+1) + " Will connect to ");
            if(is1){
                gr.addEdge((i+1)-15, i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)-15,i+1),storage[i]);
                System.out.print("1 ");
            }
            if(is2){
                gr.addEdge((i+1)-7,i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)-7,i+1),storage[i]);
                System.out.print("2 ");
            }
            if(is3){
                gr.addEdge((i+1)+8,i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)+8,i+1),storage[i]);
                System.out.print("3 ");
            }
            if(is4){
                gr.addEdge((i+1)+15,i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)+15,i+1),storage[i]);
                System.out.print("4 ");
            }
            if(is5){
                gr.addEdge((i+1)+7,i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)+7,i+1),storage[i]);
                System.out.print("5 ");
            }
            if(is6){
                gr.addEdge((i+1)-8,i+1);
                gr.setEdgeWeight(gr.getEdge((i+1)-8,i+1),storage[i]);
                System.out.print("6 ");
            }
            System.out.println();
        }

        return gr;
    }
}
