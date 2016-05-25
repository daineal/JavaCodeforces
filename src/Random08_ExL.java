import java.util.Scanner;

public class Random08_ExL {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(searcher(n));
    }
    public static long searcher(long a) {
        long step = a,
                cnt = 1,
                coor = 1;
        while (step - 1 >= 0) {
            step -= cnt;
            coor += cnt;
            cnt++;
        }
        coor -= cnt;
        return a-coor;
    }
}
