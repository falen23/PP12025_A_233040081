package Pertemuan10.Tugas1;

public class StrukturStack {

//    Latihan2
    private int [] array;
    private int capacity;
    private int Top;

    public final int Min = -1;

    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        Top = Min;
    }

//    Latihan 3
    public Boolean isEmpty() {
        return Top == Min;

    }

    public StrukturStack () {
        this(5);
    }
    public int size() {
        return Top + 1;
    }

    public Boolean isFull() {
        return Top == capacity;
    }

    public int Top() {
        if (isEmpty()) {
//            System.out.println(" # Stack Kosong 123 ");
            return -1;
        } else  {
            return Top;
        }
    }



//    Latihan1
    public void push(int data) {
        if (isFull()) {
        }
        else {
            Top++;
            array[Top] = data;
        }
    }

    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println(" # Stack Kosong ");
        } else   {
            temp = array[Top];
            Top = Top - 1;
        }
        return temp;
    }

    public String displayElements() {
        if (isEmpty()) {
            return "";
        }

        StringBuilder Elements = new StringBuilder();
        for (int i = Top; i >= 0; i--) {
            Elements.append(array[i]);
            if (i > 0) {
            Elements.append(" ");
            }
        }
        return Elements.toString();
    }
}

