# Graph Algorithms

## Breadth-First Search (BFS)

Breadth-First Search (BFS) is a graph traversal algorithm that explores all vertices at the current depth before moving on to vertices at the next depth. It uses a queue data structure to keep track of vertices to visit, ensuring that vertices are visited in a breadthward motion.

## Depth-First Search (DFS)

Depth-First Search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking. It uses a stack data structure (or recursion) to keep track of vertices to visit, allowing it to explore vertices in a depthward motion.

## Dijkstra's Algorithm (shortest path)

Dijkstra's Algorithm is a graph algorithm that finds the shortest path from a starting vertex to all other vertices in a weighted graph with non-negative edge weights. It maintains a priority queue or min-heap to efficiently select the next vertex with the smallest tentative distance.

## Bellman-Ford Algorithm (shortest path with negative weights)

The Bellman-Ford Algorithm is a graph algorithm that finds the shortest path from a starting vertex to all other vertices in a weighted graph, even when the graph contains negative edge weights. It uses dynamic programming and relaxation to iteratively update the shortest distances until convergence.

## Kruskal's Algorithm (minimum spanning tree)

Kruskal's Algorithm is a greedy algorithm that finds the minimum spanning tree of a connected, undirected graph. It starts with an empty spanning tree and iteratively adds the shortest edge that does not create a cycle, ensuring that the tree spans all vertices with minimum total edge weight.

## Prim's Algorithm (minimum spanning tree)

Prim's Algorithm is another greedy algorithm for finding the minimum spanning tree of a connected, undirected graph. It starts with a single vertex and iteratively adds the shortest edge that connects a vertex in the spanning tree to a vertex outside the tree, expanding the tree until all vertices are included.

    