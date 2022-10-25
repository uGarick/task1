public class tNine {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(sumOfCubes(arr));
    }

    static int sumOfCubes(int[] arr) {
        int res = 0;
        for (int j : arr) {
            res += Math.pow(j, 3);
        }
        return res;
    }
}
