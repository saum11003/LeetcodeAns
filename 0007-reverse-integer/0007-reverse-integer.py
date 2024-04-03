class Solution:
    def reverse(self, x: int) -> int:
        max= 2**31-1
        min=-2**31
        
        if x>0:
            sign=1
        else:
            x*=-1
            sign=-1
        
        rev= int(str(x)[::-1])*sign
        if rev >max or rev <min:
            return 0
        else:
            return rev
        