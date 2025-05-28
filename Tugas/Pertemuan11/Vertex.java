package Pertemuan11;
    // Latihan 1
public class Vertex {
    private char label;
    private boolean wasVisited;


    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }
    public char getLabel() {
        return label;
    }
    public void setLabel(char lab) {
        label = lab;
    }

}
