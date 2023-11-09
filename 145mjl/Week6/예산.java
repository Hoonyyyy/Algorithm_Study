import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int sum=0;
        while(sum<budget&&answer<d.length){
            sum+=d[answer++];
        }
        
        if(sum>budget){
            answer--;
        }
        
        return answer;
    }
}
