// 12S25045-VITA CHARISTI NAIBAHO //
// 12S25038-SAKEUS MALAU //
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        int nr, total, max, min;
        int[] nm = new int[4];

        total = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ".");
            nm[i] = Integer.parseInt(input.nextLine());
            total = total + nm[i];
        }
        nr = (double) total / 4;
        max = nm[0];
        for (i = 0; i <= 3; i++) {
            if (nm[i] > max) {
                max = nm[i];
            }
        }
        min = nm[0];
        for (i = 1; i <= 3; i++) {
            if (nm[i] == min) {
                min = nm[i];
            }
        }
        System.out.println(nr);
        System.out.println(max);
        System.out.println(min);
    }
}
