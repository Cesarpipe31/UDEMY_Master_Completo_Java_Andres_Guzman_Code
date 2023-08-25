public class OperadoresIncremental {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i=5;
        j= i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        int m = 7;
        int n = --m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int p = 11;
        int q = p++;
        System.out.println("p = " + p);
        System.out.println("q = " + q);

    }
}
