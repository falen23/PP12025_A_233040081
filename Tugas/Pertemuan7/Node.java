package Pertemuan7;

public class Node {


        private double data;
        private Pertemuan5.Node next;

        public Node(double data) {
            this.data = data;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public Pertemuan5.Node getNext() {
            return next;
        }

        public void setNext(Pertemuan5.Node next) {
            this.next = next;
        }

    }


