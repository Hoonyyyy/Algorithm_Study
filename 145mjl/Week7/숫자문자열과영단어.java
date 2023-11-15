import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringBuilder sb=new StringBuilder();
        StringBuilder answerStringBuilder=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(Character.isDigit(temp)){
                answerStringBuilder.append(temp);
                System.out.println(answerStringBuilder);
            }else{
                sb.append(temp);
                int index=Arrays.asList(numbers).indexOf(sb.toString());
                if(index!=-1){
                    answerStringBuilder.append(index);
                    sb.delete(0,sb.length());//StringBuilder 초기화
                    System.out.println(answerStringBuilder);
                }
            }
        }
        
        answer=Integer.parseInt(answerStringBuilder.toString());
        
        return answer;
    }
}
