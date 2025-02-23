public class Node {
    private int Nilai;
    private Node next;

    public Node(int nilai) {
        this.Nilai = nilai;


    }

    public int getNilai() {
        return Nilai;
    }

    public void setNilai(int nilai) {
        Nilai = nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
