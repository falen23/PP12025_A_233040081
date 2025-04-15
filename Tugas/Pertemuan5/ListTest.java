package Pertemuan5;



public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        //Latihan2
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        System.out.println("Sebelum");
        System.out.print("Elemen: ");
        list.displayElement();

        list.removeHead();
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list.displayElement();

        list.removeHead();
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list.displayElement();

        list.removeHead();
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list.displayElement();

        //Latihan4
        StrukturList list2 = new StrukturList();
        list2.addHead(2);
        list2.addTail(6);
        list2.addTail(3);
        list2.addTail(5);
        list2.addTail(1);

        System.out.println("Sebelum");
        System.out.print("Elemen: ");
        list2.displayElement();

        list2.removeTail();
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list2.displayElement();

        list2.removeHead();
        System.out.println("Hapus Head");
        System.out.print("Elemen: ");
        list2.displayElement();

        list2.removeTail();
        System.out.println("Hapus Tail");
        System.out.print("Elemen: ");
        list2.displayElement();

        //Latihan 2 P6
        StrukturList list3 = new StrukturList();
        list3.addHead(2);
        list3.addMid(6, 2);
        list3.addMid(3, 3);
        list3.addMid(5, 4);
        list3.addTail(1);

        System.out.println("Sebelum");
        System.out.print("Elemen: ");
        list3.displayElement();

        list3.removeMid(3);
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list3.displayElement();

        list3.removeMid(6);
        list3.removeMid(5);
        System.out.println("Setelah dihapus");
        System.out.println("Elemen:");
        list3.displayElement();
    }
}
