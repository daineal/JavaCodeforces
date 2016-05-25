import java.util.Scanner;

public class String61_ExF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(),
                res = "";
        char c = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > c) {
                c = str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c) {
                res += str.charAt(i);
            }
        }
        System.out.print(res);
    }
}
