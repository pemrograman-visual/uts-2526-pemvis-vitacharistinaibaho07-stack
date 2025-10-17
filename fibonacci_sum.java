// 12S25045-VITA CHARISTI NAIBAHO //
// 12S25038-SAKEUS MALAU //

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tem, jumlah, n, i;

        n = Integer.parseInt(input.nextLine());
        a = 1;
        b = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + a;
            tem = a;
            a = b;
            b = tem + b;
        }
        System.out.println(jumlah);
    }
}
