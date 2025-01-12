class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []
        opening_par = {'(', '{', '['}
        par_dict = {')' : '(', '}' : '{', ']' : '['}

        for x in s:
            if x in opening_par:
                stack.append(x)
            elif stack and par_dict[x] == stack.pop():
                continue
            else:
                return False
        
        return not stack
        