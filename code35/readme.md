# Graphs
<!-- Short summary or background information -->
* a non-linear data structure

* a collection of vertices (nodes) connected by line segments named edges.

* terminology used when working with Graphs:

  * Vertex (node): can have zero or more adjacent vertices.
  * Edge: connection between two nodes.
  * Neighbor: adjacent nodes, connected via an edge.
  * Degree: number of edges connected to that vertex

## Challenge
<!-- Description of the challenge -->
* Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
  * add node
  * add edge
  * get nodes
  * get neighbors
  * size

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
   * add node: Add a node to the graph
    * add edge: Adds a new edge between two nodes in the graph
    * get nodes: Returns all of the nodes in the graph as a collection (set, list, or similar)
    * get neighbors: Returns a collection of edges connected to the given node include the weight of the connection in the returned collection
    * size: Returns the total number of nodes in the graph

   * the time complixity for all above functions: O(1)
   * the space complixity for all above functions: O(1) 
   * the time and space complixity is O(1) since the adjacency list is used in implementation so can entered easily

## API
<!-- Description of each method publicly available in your Graph -->
* [Link To code](app/src/main/java/code35/Graph.java)