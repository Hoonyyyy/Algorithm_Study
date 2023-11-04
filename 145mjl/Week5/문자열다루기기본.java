class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6){
            return false;
        }
        
        //solution 1
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        
        //solution 2
        // for(int i=0;i<s.length();i++){
        //     if((int)s.charAt(i)<48||(int)s.charAt(i)>57){
        //         return false;
        //     }
        // }
        
        return answer;
    }
}
