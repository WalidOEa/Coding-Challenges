class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        s = str(x)[::-1]
        if str(s) == str(x):
            return True
        else:
            return False
        