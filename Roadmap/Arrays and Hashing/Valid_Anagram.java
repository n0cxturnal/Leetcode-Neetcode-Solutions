public int[] hashString(String x){
    int len = x.length();
    int[] alpha = new int[26];
    for(int i = 0; i < len; i++){
        alpha[x.charAt(i)-97]++;
    }
    return alpha;
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        if(Arrays.equals(hashString(s),hashString(t))){return true;}
        else{return false;}
    }
}

