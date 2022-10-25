public class tEight {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(nextEdge(x, y));
    }

    static int nextEdge(int x, int y){
        return (x+y)-1;
    }
}
