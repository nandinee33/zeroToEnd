import java.util.Scanner;

public class zeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int l = 0; l < n; l++) {
            a[l] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[j++] = a[i];
            }

        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
