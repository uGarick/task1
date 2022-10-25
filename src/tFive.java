public class tFive {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        System.out.println(Operation(x, y, z));
    }

    static String Operation(int x, int y, int z) {
        if (y + z == x) {
            return "added";
        }
        else if (y - z == x)
        {
            return "subtracted";
        }
        else if (y * z == x)
        {
            return "multiplied";
        }
        else if (y / z == x)
        {
            return "divided";
        }
        return "none";
    }
}