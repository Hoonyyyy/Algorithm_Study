class Solution {
    public String solution(String s) {
        String answer = "";
        //Solution 1
        // if(s.length()%2==0){
        //     answer+=s.charAt(s.length()/2-1);
        // }
        // answer+=s.charAt(s.length()/2);
        
        //Solution 2
        int length=s.length();
        if(length%2==0){
            answer=s.substring(length/2-1,length/2+1);
        }else{
            answer=Character.toString(s.charAt(length/2));
        }
        return answer;
    }
}
