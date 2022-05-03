# Self-written solution of "Climbing Stairs" from LeetCode.
# Faster than 97.31% of Python online submissions.
# author JZ-FSDev

import math

# You are climbing a staircase. It takes n steps to reach the top.
# Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
def climbStairs(n):
    """
    :type n: int
    :rtype: int
    """
    result = 0
    twos = n // 2
    print(twos)
    ones = n - twos * 2
    print(ones)
    while twos > -1:
        result += (math.factorial(twos + ones) / (math.factorial(twos) * math.factorial(ones)))
        twos -= 1
        ones += 2
    return result
