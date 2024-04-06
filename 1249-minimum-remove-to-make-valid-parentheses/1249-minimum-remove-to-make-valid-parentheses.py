class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        open=[]
        close = set()
        
        for i,char in enumerate(s):
            if char == '(':
                open.append(i)
            elif char == ')':
                if not open:
                    close.add(i)
                else:
                    open.pop()
        close.update(open)
        result=''
        for i,char in enumerate(s):
            if i not in close:
                result+=char
        return result
                
        