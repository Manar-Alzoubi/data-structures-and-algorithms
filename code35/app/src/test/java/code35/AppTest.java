/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code35;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    // Node can be successfully added to the graph
    @Test void addNodeToThegGraph() {
        Graph graph = new Graph();
        graph.addNode("A");
        assertEquals(graph.getNodes(),"Vertex { data='A' , weight=0} []");
    }
    // An edge without weight can be successfully added to the graph
    @Test void addEdgeToThegGraph() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addEdges("A","B");
        assertEquals(graph.getNodes(),"Vertex { data='A' , weight=0} [Vertex { data='B' , weight=0} ]Vertex { data='B' , weight=0} [Vertex { data='A' , weight=0} ]");
    }

    // An edge with weight can be successfully added to the graph
    @Test void addWeightedEdgeToThegGraph() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addEdges("A","B",20);
        assertEquals(graph.getNodes(),"Vertex { data='A' , weight=0} [Vertex { data='B' , weight=20} ]Vertex { data='B' , weight=0} [Vertex { data='A' , weight=20} ]");
    }

    // A collection of all nodes can be properly retrieved from the graph
    @Test void allNodesCanRecieved() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        assertEquals(graph.getNodes(),"Vertex { data='A' , weight=0} []Vertex { data='B' , weight=0} []");
    }
    // All appropriate neighbors can be retrieved from the graph
    @Test void allNeighboursCanRecieved() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addEdges("A","B");
        List<Vertex> neighbours=graph.getNeighbors("A");
        assertEquals(graph.getNeighbors("A"), neighbours);
    }
    //Neighbors are returned with the weight between nodes included
        @Test void allNeighbourswithWeightRecieved() {
            Graph graph = new Graph();
            graph.addNode("A");
            graph.addNode("B");
            graph.addEdges("A","B",20);
            List<Vertex> neighbours=graph.getNeighbors("A");
            assertEquals(graph.getNeighbors("A"),neighbours);

    }

    //The proper size is returned, representing the number of nodes in the graph
    @Test void testSize() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("V");
        graph.addNode("G");
        graph.addNode("W");
        assertEquals(graph.size(),4);
    }

    //A graph with only one node and edge can be properly returned
    @Test void oneNodeAndEdge() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addEdges("A","A");
        assertEquals(graph.getNodes(),"Vertex { data='A' , weight=0} [Vertex { data='A' , weight=0} , Vertex { data='A' , weight=0} ]");
    }

    // An empty graph properly returns null
    @Test void emptyGraph() {
        Graph graph = new Graph();

        assertEquals(graph.getNodes(),null);
    }
}
