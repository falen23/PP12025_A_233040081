package Pertemuan8;

public class ListMkTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
    list.addHead(new Matakuliah("IF001","Dasar Pemograman",4));
    list.addMid(new Matakuliah("IF003","Pemograman Web",3),3);
    list.addMid(new Matakuliah("IF004","Struktur Diskrit",3),3);
    list.addTail(new Matakuliah("IF005","Dasar Pemograman",4));
    list.displayElements();


    }

}
