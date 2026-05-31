class Solution:
    def isPalindrome(self, s: str) -> bool:
        filter=""
        for ch in s:
            if ch.isalnum():
                filter+=ch.lower()
        return filter==filter[::-1]