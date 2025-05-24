package Pertemuan10.Tugas2;

public class AbstractStack {
    //    Latihan2
    protected int [] array;
    private int capacity, Top;


    public final int Min = -1;

    public AbstractStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        Top = Min;
    }

    public  AbstractStack() {
        this(5);
    }

    //    Latihan 3
    public Boolean isEmpty() {
        return Top == Min;

    }


    public int size() {
        return Top + 1;
    }

    public Boolean isFull() {
        return (Top == capacity - 1);
    }

    public int Top() {
        if (isEmpty()) {
//            System.out.println(" # Stack Kosong 123 ");
            return -1;
        } else  {
            return array [Top];
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
            System.out.println("Stack Kosong ");
        } else   {
            temp = array[Top];
            Top = Top - 1;
        }
        return temp;
    }

    public String displayElements() {
        String element = "";
        for (int i = Top; i > Min; i--) {
            element = element + array[i]+ " ";
        }
        return element;
    }
}
