package Pertemuan10.Tugas1;

public class MainStack {
    public static void main(String[] args) {
//        Latihan4
        System.out.println(" # Sebelum Push ");
        StrukturStack stack = new StrukturStack();
        System.out.println("size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top :" + stack.Top());
        System.out.println("Elements From Top :" + stack.displayElements());

        System.out.println("Melakukan push 3x");


        StrukturStack stack2 = new StrukturStack();
        stack2.push(2);
        stack2.push(4);
        stack2.push(1);

        System.out.println("size :" + stack2.size());
        System.out.println("Empty :" + stack2.isEmpty());
        System.out.println("Full :" + stack2.isFull());
        System.out.println("Top :" + stack2.Top());
        System.out.println("Elements From Top :" + stack2.displayElements());

        System.out.println();



//        Tugas
        stack.pop();
        stack.pop();

        System.out.println("Setelah Pop");
        System.out.println("size :" + stack.size());
        System.out.println("Empty :" + stack.isEmpty());
        System.out.println("Full :" + stack.isFull());
        System.out.println("Top :" + stack.Top());
        System.out.println("Elements From Top :" + stack2.displayElements());
    }
}
