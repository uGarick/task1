public class tSeven {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(addUpTo(x));
    }

    static int addUpTo(int x){
        int res = 0;
        for (int i = 0; i<=x; i++){
            res += i;
        }
        return res;
    }
}
