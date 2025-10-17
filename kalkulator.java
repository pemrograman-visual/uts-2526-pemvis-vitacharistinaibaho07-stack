import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, d, e, f, g, h, i, j, k, l, m, n, o;

        a = Double.parseDouble(input.nextLine());
        if (a == 4) {
            System.out.println("Masukkan angka pertama dan kedua");
            d = Double.parseDouble(input.nextLine());
            e = Double.parseDouble(input.nextLine());
            b = d / e;
            System.out.println(b);
        } else {
            if (a == 3) {
                System.out.println("Masukkan angka pertama dan kedua");
                f = Double.parseDouble(input.nextLine());
                g = Double.parseDouble(input.nextLine());
                h = f * g;
                System.out.println(h);
            } else {
                if (a == 2) {
                    System.out.println("Masukkan angka pertama dan kedua");
                    i = Double.parseDouble(input.nextLine());
                    j = Double.parseDouble(input.nextLine());
                    k = i - j;
                    System.out.println(k);
                } else {
                    if (a == 1) {
                        System.out.println("Masukkan angka pertama dan kedua");
                        k = Double.parseDouble(input.nextLine());
                        l = Double.parseDouble(input.nextLine());
                        m = k + l;
                        System.out.println(m);
                    }
                }
            }
        }
    }
}
