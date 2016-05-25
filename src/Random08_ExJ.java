import java.util.Scanner;

public class Random08_ExJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(solve(a, b));
    }

    private static int solve(String a, String b) {
        int start = 0;
        int res = 0;
        while (true) {
            int end = a.indexOf(b, start);
            start = end + b.length();
            if (end == -1)
                break;
            res++;
        }
        return res;
    }

}