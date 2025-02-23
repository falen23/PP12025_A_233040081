package Pertemuan3;

public class StrukturList {

    Node HEAD;

    boolean isEmpty() {
        return HEAD == null;
    }
    public void addTail(int data) {

        Node posNode= null, curNode= null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            curNode =  HEAD;
            while (curNode != null)
            {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext (HEAD);
            HEAD = newNode;
        }
    }
}
