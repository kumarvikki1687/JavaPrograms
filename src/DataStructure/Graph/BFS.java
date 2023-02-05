package DataStructure.Graph;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int noOfVertex;
    LinkedList<Integer> adj[];
    boolean visited[];

    Graph(int noOfVertex) {
        this.noOfVertex = noOfVertex;
        this.adj = new LinkedList[noOfVertex];
        this.visited = new boolean[noOfVertex];

        for(int i=0;i<noOfVertex;i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    void BFSTraverse(int vertex) {
        Queue<Integer> que = new LinkedList<>();
        que.add(vertex);
        while(!que.isEmpty()) {
            int currVertex = que.poll();
            if(visited[currVertex]) return;
            System.out.print(currVertex + " ");
            visited[currVertex] = true;
            for(int i=0;i<adj[currVertex].size();i++) {
                que.add(adj[currVertex].get(i));
            }
            // que.addAll(adj[currVertex]);     // add all adj of currVertex in one shoot
        }
        System.out.println();
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.BFSTraverse(2);
    }
}
