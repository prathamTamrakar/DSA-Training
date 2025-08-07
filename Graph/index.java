

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Node{
    int source;
    int destination;
    int weight;
    
    Node(int source,int destination,int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
    public  String toString(){
   return "{"+source+","+destination+","+weight+"}";
    }
}


public class index {
    public static void buildgraph( ArrayList<Node> glist[],int source,int destination,int weight){
        glist[source].add(new Node(source, destination,weight));
        glist[destination].add(new Node(source, destination,weight));
    }
    public static void bfs(ArrayList<Node> glist[],int source,boolean visited[]){
       Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
         visited[source]=true;
       
        
        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.println(current+"");
            for(Node next:glist[current]){
                if(!visited[next.destination]){
                    visited[next.destination]=true;
                    queue.add(next.destination);
                }
            }
        }
    }
    public static void print( ArrayList<Node> glist[]){
        for (int i = 0; i < glist.length; i++) {
            System.out.println(i+"Nodes");
            for(Node next:glist[i]){
                System.out.println(next);
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        ArrayList<Node> glist[]=new ArrayList[n];
        
        for (int i = 0; i <glist.length; i++) {
            glist[i]=new ArrayList<>();
        }
        
        buildgraph(glist, 0, 1,20);
        buildgraph(glist, 1, 0,25);
        buildgraph(glist, 2, 3,30);
        print(glist);
        boolean visited[]=new boolean[n];
        System.out.println("BFS traversal starting from node 0 and 2:");
        bfs(glist, 0, visited);
        bfs(glist,2,visited);
        System.out.println("BFS traversal completed.");
    }
    
}