class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> vals = new HashMap<>();
        vals.put('I',1);
        vals.put('V',5);
        vals.put('X',10);
        vals.put('L',50);
        vals.put('C',100);
        vals.put('D',500);
        vals.put('M',1000);
       
        int ans=0;
        
        for(int i =0;i<s.length();i++){
            if(i<s.length()-1 && vals.get(s.charAt(i))<vals.get(s.charAt(i+1))){
                ans-= vals.get(s.charAt(i));
}else{
                ans+= vals.get(s.charAt(i));
            
        }
    }
        return ans;
        
    }
}