#include <iostream>
#include <queue>

using namespace std;

class Graph{
    int **adjancyMatrix;
    int vertices;
    public:
        Graph(int noOfVertices);
        void addEdge(int u, int v);
        void removeEdge(int u, int v);
        void breadthFirstTraversal(int sourceVertice);
        void printGraph();
};

Graph::Graph(int noOfVertices) {
    vertices = noOfVertices;
    for (int i = 0; i < noOfVertices; i++) {
        adjancyMatrix[i] = new int[noOfVertices];
    }
}

void Graph::addEdge(int u, int v) {
    if ((u >=0 && u < vertices) && (v >= 0 && v < vertices)) {
        adjancyMatrix[u][v] = 1;
    }
    else {
        cout << "node not present" << endl;
    }
}

void Graph::breadthFirstTraversal(int sourceVertex) {
    bool hasVisited[vertices];
    for (int i = 0; i < vertices; i++) {
        hasVisited[i] = false;
    }
    queue<int> toVisit;
    toVisit.push(sourceVertex);
    while (!toVisit.empty()) {
        int vertex = toVisit.front();
        toVisit.pop();
        hasVisited[vertex] = true;
        cout << vertex << " ";
        for (int i = 0; i < vertices; i++) {
            if (adjancyMatrix[vertex][i] == 1 && hasVisited[i] == false) {
                toVisit.push(i);
            }
        }
    }
    cout << endl;
}

void Graph::printGraph() {
    for (int i = 0; i < vertices; i++) {
        for (int j = 0; j < vertices; j++) {
            cout << adjancyMatrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    Graph mini(5);
    while (true) {
        cout << "enter edge u, v ";
        int u, v;
        cin >> u >> v;
        mini.addEdge(u, v);
        mini.printGraph();
    }
    return 0;
}

