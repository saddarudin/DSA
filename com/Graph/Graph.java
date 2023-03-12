package com.Graph;

public class Graph {
    //Graph  is also known as free tree
    //cyclic graph
    //acyclic graph
    //graph is used to store connection
    //graph data base is an example e.g neo fourJ
    //weighted graph, unweighted graph
    //directed and undirected graph
    int size;
    String[] vertices;
    boolean[][] a;
    public Graph(String[]args){
        size=args.length;
        vertices=new String[size];
        System.arraycopy(args,0,vertices,0,size);
        a=new boolean[size][size];
    }
    public void add(String v,String w){
        int i=index(v),j=index(w);
        a[i][j]=a[j][i]=true;
    }
    private int index(String v){
        for(int i=0;i<size;i++)
            if(vertices[i].equals(v))return i;
        return size;
    }

    @Override
    public String toString() {
        if(size==0)return "{}";
        StringBuilder s=new StringBuilder("{ "+vertex(0));
        for(int i=1;i<size;i++)s.append(", ").append(vertex(i));
        return s+" }";
    }
    private String vertex(int i){
        StringBuilder s=new StringBuilder(vertices[i]+" : ");
        for(int j=0;j<size;j++)if(a[i][j])s.append(vertices[j]);
        return s+"";
    }

    public static void main(String[] args) {
        String[] s={"A","B","C","D","E"};
        Graph g=new Graph(s);
        g.add("A","B");
        g.add("A","B");
        g.add("A","B");
        g.add("A","B");
        g.add("A","B");
        g.add("A","B");
    }
}
