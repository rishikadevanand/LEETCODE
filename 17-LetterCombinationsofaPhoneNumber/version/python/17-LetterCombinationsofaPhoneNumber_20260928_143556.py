# Last updated: 9/28/2026, 2:35:56 PM
1class Solution:
2    def letterCombinations(self, digits: str) -> List[str]:
3        if not digits:
4            return []
5        
6        digit_to_letters = {
7            '2': 'abc',
8            '3': 'def',
9            '4': 'ghi',
10            '5': 'jkl',
11            '6': 'mno',
12            '7': 'pqrs',
13            '8': 'tuv',
14            '9': 'wxyz',
15        }
16
17        def backtrack(idx, comb):
18            if idx == len(digits):
19                res.append(comb[:])
20                return
21            
22            for letter in digit_to_letters[digits[idx]]:
23                backtrack(idx + 1, comb + letter)
24
25        res = []
26        backtrack(0, "")
27
28        return res