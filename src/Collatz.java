public class Collatz {
    public static void main(String[] args) {

        int maxWert = 0;
        int maxStart = 0;
        for (int start = 1; start < 100; start++) {
            int n = start;
            int zähler = 0;
            while (n != 1) {
                zähler++;
                if (n % 2 == 1) n = n * 3 + 1;
                else n = n / 2;
            }
            if (zähler > maxWert) {
                maxWert = zähler;
                maxStart = start;
            }
        }
        System.out.println(maxStart + " hat den größten Collatzwert " + maxWert);
    }
}
