class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num==1){
            return answer;
        }
        
        long temp=num;
        do{
            if(answer==500){
                return -1;
            }
            if(temp%2!=0){
                temp*=3;
                temp++;
            }else{
                temp/=2;
            }
            answer++;
        }while(temp!=1L);
        return answer;
    }
}
