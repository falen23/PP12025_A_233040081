package Pertemuan10.Tugas2;

public class ParsePost {
    private MyStack stack;
    private String input;

    public ParsePost(String input) {
        super();
        this.input = input;
    }

    public int doParse() {
        stack = new MyStack(20);
        char ch;
        int i;
        int bill, bill2, hasilops;

        for (i = 0;i < input.length();i++) {
            ch = input.charAt(i);
            stack.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9') {
                stack.push((int) (ch-'0'));
            }
            else {
                bill2 = stack.pop();
                bill = stack.pop();
                switch (ch) {
                    case '+': hasilops = bill2 + bill; break;
                    case '-': hasilops = bill2 - bill; break;
                    case '*': hasilops = bill2 * bill; break;
                    case '/': hasilops = bill2 / bill; break;
                    default: hasilops = 0;
                }
            stack.push(hasilops);
            }
        }
        hasilops = stack.pop();
        return hasilops;
    }
}
