import math


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
