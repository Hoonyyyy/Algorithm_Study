import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        // Solution 1
        boolean[] check=new boolean[arr.length];
        int cnt=0;
        cnt++;
                
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                check[i]=true;
            }else{
                cnt++;
            }
        }
        
        answer=new int[cnt];
        int cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(!check[i]){
                answer[cnt2++]=arr[i];
            }
        }


        
        // Solution 2
        // Stack<Integer> stack=new Stack<>();
        // stack.push(arr[0]);
        
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=stack.peek()){
        //         stack.push(arr[i]);
        //     }
        // }
        
        // answer=new int[stack.size()];
        // for(int i=stack.size()-1;i>=0;i--){
        //     answer[i]=stack.pop();
        // }
        return answer;
    }
}
