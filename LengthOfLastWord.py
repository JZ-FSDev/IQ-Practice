# Self-written solution of "Length of Last Word" from LeetCode.
# Faster than 89.05%% of Python online submissions.
# author JZ-FSDev

# Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
# A word is a maximal substring consisting of non-space characters only.
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
