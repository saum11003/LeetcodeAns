class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count =0;
        
        for(char i : s.toCharArray()){
            if (i == '('){
                if(count>0){
                    result.append(i);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    result.append(i);
                }
            }
}
        return result.toString();
        
    }
}