import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //Sol 1
        int[] compare=new int[s.length()];
        for(int i=0;i<s.length();i++){
            compare[i]=s.charAt(i);
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i-1;j++){
                if(compare[j]<compare[j+1]){
                    int temp=compare[j];
                    compare[j]=compare[j+1];
                    compare[j+1]=temp;
                }
            }    
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append((char)compare[i]);;
        }
        answer=sb.toString();
        
        
        return answer;
    }
}
