public class tTwo {
    public static void main(String[] args) {
        double x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);
        System.out.println(triArea(x, y));
    }

    static double triArea(double x, double y) {
        return ((x/2)*y);
    }
}
