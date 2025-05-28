package Pertemuan11;
    //Latihan 2
public class Graph {
    private Vertex VertexList[]; // Array of vertices
    private int adjMat[][]; // adjency matrix
    private int nVerts; // curret number of vertices

    public Graph(int maxVerts) {
        VertexList = new Vertex [maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        for (int i = 0; i < maxVerts; i++)
            for (int j = 0; j < maxVerts; j++)
                adjMat[i][j] = 0;
    }

    //Latihan 3
    public void addVertex(char lab) {
        VertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int Start, int End) {
        adjMat[Start][End] = 1;
        adjMat[End][Start] = 1;
    }

//    Latihan 4
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
