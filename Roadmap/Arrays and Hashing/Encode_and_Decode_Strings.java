class Solution {

    public String encode(List<String> strs) {
        String fin = "";
        for(String s : strs){
            fin = fin + s + "\t";
        }
        return fin;
    }

    public List<String> decode(String str) {
        List<String> fin = new ArrayList<String>();
        int index = str.indexOf('\t');
        String strcopy = str;       
        while(index!=-1){
            fin.add(strcopy.substring(0, index));
            strcopy = strcopy.substring(index+1);
            index = strcopy.indexOf('\t');
        }
        return fin;
    }
}