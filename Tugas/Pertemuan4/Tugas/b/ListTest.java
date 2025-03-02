package Pertemuan4;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(4.5);
        list.addTail(5.5);
        list.addMid(1.1, 1);
        list.addMid(2.1, 1);
        list.addHead(3.4);

        System.out.println("Elemen:");
        list.displayElement();
    }
}