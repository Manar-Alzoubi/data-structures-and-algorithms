package code37;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;


    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    // Buisness Trip for code challenge 37

    int cost =0;
    public int businessTrip(Graph graph, String[] citieNames) {
        cost = 0;
        for (int i = 0; i < citieNames.length- 1; i++) {
            for (Vertex vertex : graph.getNeighbors(citieNames[i])) {
                if (Objects.equals(citieNames[i+1], vertex.data)) {
                    cost += vertex.weight;
                }
            }
        }
            return cost;
    }

    // Add a node to the graph Returns: The added node
    public Vertex addNode(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());
        return vertex;
    }
    // Adds a new edge between two nodes in the graph
    public void addEdges(String data1,String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    // Adds a new edge with weight between two nodes in the graph
    public void addEdges(String data1,String data2,int weight){
        Vertex vertex1 = new Vertex(data1,weight);
        Vertex vertex2 = new Vertex(data2,weight);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    // Returns all of the nodes in the graph as a collection
    String getNodes() {
        if(size() ==0)
            return null;
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }


    public List<Vertex> getNeighbors(String data){
        return adjVertices.get(new Vertex(data));
    }

    // Returns the total number of nodes in the graph
    public int size() {
        return adjVertices.size();
    }

    String printGraph() {
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }
}