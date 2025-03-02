package Pertemuan4;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(4.5);
        list.addMid(3.4, 1);
        list.addHead(2.1);

        System.out.println("Elemen:");
        list.displayElement();
    }
}