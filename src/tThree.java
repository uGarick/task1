public class tThree {
    public static void main(String[] args) {
        int ch = Integer.parseInt(args[0]);
        int cows = Integer.parseInt(args[1]);
        int pigs = Integer.parseInt(args[2]);
        System.out.println(Animal(ch, cows, pigs));
    }

    static int Animal(int ch, int cows, int pigs){
        return (ch*2)+(cows*4)+(pigs*4);
    }
}
