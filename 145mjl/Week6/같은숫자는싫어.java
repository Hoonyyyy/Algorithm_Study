import java.util.*;

public class Solution {//효율성 테스트 - 통과 (16.19ms, 112MB)
    public int[] solution(int []arr) {
        int[] answer = {};
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

        return answer;
    }
}
