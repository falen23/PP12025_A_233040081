package Pertemuan8;

public class StrukturList {

    public Node HEAD;

    StrukturList(){
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }

    public void addTail(Matakuliah data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }


    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(Matakuliah data, int position){
        Node posNode = null, curNode;
        int i;
        Node newNode = new Node(data);
        if(HEAD == null){
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            if(position == 1){
                newNode.setNext(curNode);
                HEAD = newNode;
            }
            else {
                i = 1;
                while(curNode != null && i < position){
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData().getKode()+"\t"+curNode.getData().getNama() + ","+curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        }
        else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail(){
        Node preNode = null, lastNode;
        if (HEAD != null){
            if (HEAD.getNext()==null){
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null){
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
            }
        }
    }



    //Tugas
    public void clear() {
        Node curNode = HEAD;
        while (curNode != null) {
            Node next = curNode.getNext();
            dispose(curNode);
            curNode = next;
        }
        HEAD = null;
        System.out.println("List kosong");
    }
}
