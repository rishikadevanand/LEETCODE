# Last updated: 9/28/2026, 2:48:56 PM
1class Solution:
2    def countAndSay(self, n: int) -> str:
3        if n == 1:
4            return "1"
5        return self.rle(self.countAndSay(n - 1))
6
7    def rle(self, s: str) -> str:
8        result = []
9        count = 1
10        for i in range(1, len(s)):
11            if s[i] == s[i - 1]:
12                count += 1
13            else:
14                result.append(f"{count}{s[i - 1]}")
15                count = 1
16        result.append(f"{count}{s[-1]}")
17        return ''.join(result)