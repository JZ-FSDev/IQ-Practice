def lengthOfLastWord(self, s):
    """
    :type s: str
    :rtype: int
    """
    s = s.strip()
    length = 0
    index = len(s) - 1
    while index >= 0 and s[index] != " ":
        length += 1
        index -= 1
    return length
