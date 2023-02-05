package DataStructure.Graph;

import java.util.LinkedList;

class GraphNew {
    int noOfVertex;
    LinkedList<Integer> adj[];
    boolean visited[];

    GraphNew(int noOfVertex) {
        this.noOfVertex = noOfVertex;
        this.adj = new LinkedList[noOfVertex];
        this.visited = new boolean[noOfVertex];

        for (int i = 0; i < noOfVertex; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    void DFSTraverse(int vertex) {
        if(visited[vertex]) return;
        System.out.print(vertex + " ");
        visited[vertex] = true;
        for(int i=0;i<adj[vertex].size();i++) {
            DFSTraverse(adj[vertex].get(i));
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        GraphNew graphNew = new GraphNew(4);
        graphNew.addEdge(0, 1);
        graphNew.addEdge(0, 2);
        graphNew.addEdge(1, 2);
        graphNew.addEdge(2, 0);
        graphNew.addEdge(2, 3);
        graphNew.addEdge(3, 3);

        graphNew.DFSTraverse(2);
    }
}
