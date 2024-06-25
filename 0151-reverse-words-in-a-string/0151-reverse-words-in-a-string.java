class Solution {
    public String reverseWords(String s) {
        StringBuilder newn = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i = arr.length-1;i>=0;i--){
            newn.append(arr[i]);
            if(i>0){
                newn.append(" ");
            }
        }
        return newn.toString();
        
    }
}