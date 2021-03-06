/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }
    @Test
    void test1()
    {
        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdges("A","B");
        graph.addEdges("B","C");
        graph.addEdges("A","C");
        List<String> dfs = new ArrayList<>();
        dfs.add("A");
        dfs.add("C");
        dfs.add("B");

        assertEquals(graph.depthFirst(new Vertex ("A")), dfs);
    }

    @Test
    void test2()
    {
        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdges("A","B");
        graph.addEdges("B","C");
        graph.addEdges("A","C");
        graph.addEdges("A","C");
        graph.addEdges("C","D");

        List<String> dfs = new ArrayList<>();
        dfs.add("A");
        dfs.add("C");
        dfs.add("D");
        dfs.add("B");


        assertEquals(graph.depthFirst(new Vertex ("A")), dfs);
    }
    @Test
    void test3()
    {
        Graph graph = new Graph();

        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");

        graph.addEdges("1","2");
        graph.addEdges("2","3");
        graph.addEdges("2","4");

        List<String> dfs = new ArrayList<>();
        dfs.add("1");
        dfs.add("2");
        dfs.add("4");
        dfs.add("3");

        assertEquals(graph.depthFirst(new Vertex ("1")), dfs);
    }
}
