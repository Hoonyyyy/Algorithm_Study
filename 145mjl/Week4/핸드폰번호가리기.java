class Solution {
    public String solution(String phone_number) {
        int length=phone_number.length();
        String answer = "";
        for(int i=0;i<length-4;i++){
            answer+="*";
        }
        answer+=phone_number.substring(length-4);
        return answer;
    }
}
