package Pertemuan9;

public class EnqueMain {
    public static void main(String[] args) {
//    Latihan4
        StrukturEnque q = new StrukturEnque();
        System.out.println(" ### Sebelum Enque 3x ###");
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());

        System.out.println();

        System.out.println(" ### Sebelum Enqueue 3x ###");
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("Front: " + q.front());

        System.out.println();

//        Latihan5
        StrukturEnque q2 = new StrukturEnque();
        System.out.print("### Sebelum Enqueue 4x ###");
        q2.displayElementsNoQueue();

        System.out.print("### Sebelum Enqueue 4x ###");
        q2.enqueue(2);
        q2.enqueue(7);
        q2.enqueue(6);
        q2.enqueue(1);
        q2.displayElements();

        System.out.println();

        StrukturEnque q3 = new StrukturEnque();
        System.out.println("### Sebelum Dequeue ###");
        q3.enqueue(2);
        q3.enqueue(7);
        q3.enqueue(6);
        q3.enqueue(1);
        q3.displayElements();

        System.out.println();

        System.out.println("### Dequeue ###");
        q3.dequeue();
        q3.displayElements();
    }
}
