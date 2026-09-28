# Last updated: 9/28/2026, 8:02:48 AM
1from typing import List
2
3class Solution:
4    def threeSum(self, nums: List[int]) -> List[List[int]]:
5        nums.sort()
6        res = []
7        n = len(nums)
8
9        for i in range(n - 2):
10            # Skip duplicate fixed elements
11            if i > 0 and nums[i] == nums[i - 1]:
12                continue
13
14            j, k = i + 1, n - 1
15
16            while j < k:
17                total = nums[i] + nums[j] + nums[k]
18
19                if total == 0:
20                    res.append([nums[i], nums[j], nums[k]])
21                    j += 1
22                    k -= 1
23
24                    # Skip duplicate second elements
25                    while j < k and nums[j] == nums[j - 1]:
26                        j += 1
27
28                elif total < 0:
29                    j += 1
30                else:
31                    k -= 1
32
33        return res