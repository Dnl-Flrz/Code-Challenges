public class CODE_2 {
    public static void main(String[] args) {
        long ant = 0, act = 1, x;
        for (int i = 2; i < 50; i++) {
            System.out.print(ant + "," + "\t");
            x = ant + act;
            ant = act;
            act = x;
        }
    }
}
