public class Collatz {
    public static void main(String[] args) {

        int minWert = 99999;
        int minStart = 0;
        for (int start = 10; start < 100; start++) {
            int n = start;
            int zähler = 0;
            while (n != 1) {
                zähler++;
                if (n % 2 == 1) n = n * 3 + 1;
                else n = n / 2;
            }
            if (zähler < minWert) {
                minWert = zähler;
                minStart = start;
            }
        }
        System.out.println(minStart + " hat den kleinsten Collatzwert " + minWert);
        //System.out.println(maxStart + " hat den größten Collatzwert " + maxWert);
    }
}
