# Last updated: 9/28/2026, 2:38:37 PM
1class Solution:
2    def generateParenthesis(self, n: int):
3        result = []
4        
5        def backtrack(current, open_count, close_count):
6            if open_count == n and close_count == n:
7                result.append(current)
8                return
9            
10            if open_count < n:
11                backtrack(current + '(', open_count + 1, close_count)
12            if close_count < open_count:
13                backtrack(current + ')', open_count, close_count + 1)
14        
15        backtrack("", 0, 0)
16        return result