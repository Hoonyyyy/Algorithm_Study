import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        
        for(int i=1;i<food.length;i++){
            for(int j=1;j<=food[i]/2;j++){
                sb.append(i);
                stack.push(i);
            }
        }
        
        sb.append(0);
        
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        
        answer=sb.toString();
        
        return answer;
    }
}
