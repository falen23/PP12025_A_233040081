package Pertemuan9;

public class StrukturEnque {
    public Node FRONT;
    public Node REAR;

    StrukturEnque(){
        FRONT = null;
    }

//    latihan2
    public boolean isEmpty() {
        return FRONT == null;
    }

    public int count() {
        Node curNode = FRONT;
        int jum = 0;


        while (curNode != null) {
            jum++;
            curNode = curNode.getNext();
        }
        return jum;
    }


// Latihan5
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("size:" + size());
            System.out.println("isEmpty:" + isEmpty());
            System.out.println("Elemen Queue: ");
        }else {
            Node curNode = FRONT;
            System.out.println("size:" + size());
            System.out.println("isEmpty:" + isEmpty());
            System.out.println("Elemen Queue: ");
            while (curNode != null) {
                System.out.println( +curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
            System.out.println("Front: " + FRONT);
        }
    }

    public void displayElementsNoQueue() {
        if (isEmpty()) {
            System.out.println("size:" + size());
            System.out.println("isEmpty:" + isEmpty());
            System.out.println("Elemen Queue: Queue kosong");
        }else {
            Node curNode = FRONT;
            System.out.println("size:" + size());
            System.out.println("isEmpty:" + isEmpty());
            System.out.println("Elemen Queue: Queue kosong");
            System.out.println();
        }
        System.out.println();
    }


//    Latihan1
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            REAR = newNode;
            FRONT = newNode;
        }
        else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int dequeue() {
        int data = -1;
        if (isEmpty()) {
            data = FRONT.getData();
            FRONT = FRONT.getNext();
            if (isEmpty()) {
                REAR = null;
            }
        }
        return data;
    }

//    latihan 3
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
}
