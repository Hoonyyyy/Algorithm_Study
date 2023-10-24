class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){//조건식이 true일 때에도 seoul[i]=="Kim"은 false
                answer="김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}
