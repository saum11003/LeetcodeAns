class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        opt = []
        for i in range(len(number)):
            if number[i] == digit:
                opt.append(number[:i] + number[i+1:])
        
        return max(opt)