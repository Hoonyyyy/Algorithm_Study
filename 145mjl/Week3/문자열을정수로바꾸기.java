class Solution {
    public int solution(String s) {
        int answer = 0;
        char sign=s.charAt(0);
        
        if(sign=='-'){
            answer=Integer.parseInt(s.substring(1));
            answer*=-1;
        }else{
            answer=Integer.parseInt(s);
        }
        
        return answer;
    }
}
