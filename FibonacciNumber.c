// @author JZ-FSDev
// Runtime: 0 ms, faster than 100.00% of C online submissions for Fibonacci Number.

// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).

int fib(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    int sol[n + 1];
    sol[0] = 0;
    sol[1] = 1;
    for(int  i = 2; i <= n; i++){
        sol[i] = sol[i - 1] + sol[i - 2];
    }
    return sol[n];
}
