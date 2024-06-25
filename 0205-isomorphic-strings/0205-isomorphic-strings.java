class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        
        for(int i =0;i<s.length();i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            
            if(mapS.containsKey(S)){
                if(mapS.get(S)!=T){
                    return false;
                }
            }else{
                mapS.put(S,T);
            }
            
            if(mapT.containsKey(T)){
                if(mapT.get(T)!=S){
                    return false;
                }
            }else{
                mapT.put(T,S);
            }
        }
        return true;
    }
}