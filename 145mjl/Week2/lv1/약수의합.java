class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=0;
        if(n==0){
            return 0;
        }
        do{
            if(n%++cnt==0)
                answer+=cnt;
        }while(cnt<=n);
        return answer;
        
    }
}
