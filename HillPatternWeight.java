import java.util.Scanner;
public class HillPatternWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                weight += i;
            }
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                weight += i;
            }
        }
        System.out.println(weight);
        sc.close();
    }
}
