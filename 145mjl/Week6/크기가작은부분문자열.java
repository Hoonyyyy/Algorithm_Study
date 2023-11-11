class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum=Long.parseLong(p);
    
        for(int i=0;i<t.length()-p.length();i++){
            long tNum=Long.parseLong(t.substring(i,i+p.length()));
            if(tNum<=pNum){
                answer++;
            }
        }
        
        if(Long.parseLong(t.substring(t.length()-p.length()))<=pNum){
            answer++;
        }
        
        return answer;
    }
}
