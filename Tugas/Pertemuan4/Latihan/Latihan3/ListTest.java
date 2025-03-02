package Pertemuan4;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addTail(8);
        list.addHead(5);

        System.out.println("Elemen:");
        list.displayElement();
    }
}