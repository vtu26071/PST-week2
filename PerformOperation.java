import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }
    public static PerformOperation isPrime() {
        return a -> {
            if (a <= 1) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }
    public static PerformOperation isPalindrome() {
        return a -> {
            int num = a, rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
           return rev == a;
        };
    }
}
