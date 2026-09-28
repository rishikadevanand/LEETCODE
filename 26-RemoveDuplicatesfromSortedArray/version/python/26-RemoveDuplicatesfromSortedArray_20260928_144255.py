# Last updated: 9/28/2026, 2:42:55 PM
1class Solution:
2    def removeDuplicates(self, nums):
3        if not nums:  # Handle empty list case
4            return 0
5
6        j = 0  # Pointer for the position of unique elements
7        for i in range(1, len(nums)):
8            if nums[j] != nums[i]:
9                j += 1  # Move to the next position for unique element
10                nums[j] = nums[i]  # Assign the unique element
11
12        return j + 1  # Return the length of the list with unique elements