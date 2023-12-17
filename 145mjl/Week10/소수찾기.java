import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            if(check(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean check(int n){
        for(int i=2;i<=(int)Math.floor(Math.sqrt(n));i++){
            if(n%i==0){
                return false;
            }    
        }
        
        //System.out.println(n);
        return true;
    }
}
