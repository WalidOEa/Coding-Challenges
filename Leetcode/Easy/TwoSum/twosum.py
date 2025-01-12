class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        indexed_nums = sorted((num, index) for index, num in enumerate(nums))

        l = 0
        r = len(nums) - 1

        while l < r:
            current_sum = indexed_nums[l][0] + indexed_nums[r][0]

            if current_sum > target:
                r -= 1
            elif current_sum < target:
                l += 1
            else:
                return [indexed_nums[l][1], indexed_nums[r][1]]