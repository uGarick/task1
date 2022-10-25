public class tFour {
    public static void main(String[] args) {
        double prob = Double.parseDouble(args[0]);
        double prize = Double.parseDouble(args[1]);
        double pay = Double.parseDouble(args[2]);
        System.out.println(profitableGamble(prob, prize, pay));
    }

    static boolean profitableGamble(double prob, double prize, double pay) {
        return prob*prize>pay;
    }
}
