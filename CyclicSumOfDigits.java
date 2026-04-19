import java.util.Scanner;
public class CyclicSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        String str = sc.nextLine();
        int n = str.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int idx = (i + j) % n;
                sum += str.charAt(idx) - '0';
            }
            result += sum;
        }
        System.out.println(result);
        sc.close();
    }
}

