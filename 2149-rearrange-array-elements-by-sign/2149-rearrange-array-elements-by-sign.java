class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int num : nums){
            if(num>0){
                positive.add(num);
}else{
                negative.add(num);
            }
}
        int posindex=0;
        int negindex=0;
        
        for(int i =0;i<nums.length;i++){
if(i%2==0){
    nums[i]=positive.get(posindex++);
    
}else{
nums[i]=negative.get(negindex++);
}
        }
        return nums;
    }
}