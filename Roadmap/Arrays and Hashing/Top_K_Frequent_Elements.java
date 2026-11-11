class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> occurences = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(occurences.containsKey(nums[i])){
                int value = occurences.get(nums[i]);
                occurences.put(nums[i], value + 1);
                continue;
            }
            occurences.put(nums[i], 1);
        }
        int[] leads = new int[k];
        int maxVal = -1000;
        int maxKey = 0;
        for(int i = 0; i < k; i++){
            for(int key : occurences.keySet()){
                if(occurences.get(key)>=maxVal){
                    maxKey = key;
                    maxVal = occurences.get(key);
                }
            }
            leads[i] = maxKey;
            occurences.remove(maxKey);
            maxVal = -1000;
        }
        return leads;
    }

}
