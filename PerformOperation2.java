public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int type = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation op;
            if (type == 1) {
                op = MyMath.isOdd();
                System.out.println(op.check(num) ? "ODD" : "EVEN");
            } else if (type == 2) {
                op = MyMath.isPrime();
                System.out.println(op.check(num) ? "PRIME" : "COMPOSITE");
            } else {
                op = MyMath.isPalindrome();
                System.out.println(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}

