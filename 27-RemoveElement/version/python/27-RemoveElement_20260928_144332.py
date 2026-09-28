# Last updated: 9/28/2026, 2:43:32 PM
1class Solution:
2    def removeElement(self, nums: List[int], val: int) -> int:
3        index = 0
4        for i in range(len(nums)):
5            if nums[i] != val:
6                nums[index] = nums[i]
7                index += 1
8        return index