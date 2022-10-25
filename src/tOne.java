public class tOne {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(Remainder(x, y));
    }

    static int Remainder(int x, int y) {
        return x%y;
    }
}
