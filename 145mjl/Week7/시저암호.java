class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] charArray=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            int asciiValue=(int)charArray[i];
            if(asciiValue>=(int)'a'&&asciiValue<=(int)'z'){
                asciiValue+=n;
                if(asciiValue>(int)'z'){
                    asciiValue-=26;
                }
            }
            if(asciiValue>=(int)'A'&&asciiValue<=(int)'Z'){
                asciiValue+=n;
                if(asciiValue>(int)'Z'){
                    asciiValue-=26;
                }
            }
            sb.append((char)asciiValue);
        }
        
        answer=sb.toString();
        
        return answer;
    }
}
