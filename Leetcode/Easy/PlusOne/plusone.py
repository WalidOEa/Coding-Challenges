class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        
        digits = int("".join(map(str, digits)))
        digits += 1
        digits = map(int, str(digits))

        return digits
        