public class FibonacciBottomUp {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1]; // Initialize array with size n+1
        dp[0] = 0; // Base case
        dp[1] = 1; // Base case

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1]; // Recurrence relation
        }

        return dp[n]; // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        System.out.println(fib(10)); // Output: 55
    }
}
