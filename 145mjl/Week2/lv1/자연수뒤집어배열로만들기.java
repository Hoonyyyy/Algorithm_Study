class Solution {
    public int[] solution(long n) {
        int[] temp=new int[11];
        int cnt=0;
        while(true){
            temp[cnt]=(int)(n%10);
            n/=10;
            cnt++;
            if(n==0){
                break;
            }
        }
        int[] answer=new int[cnt];
        for(int i=0;i<cnt;i++){
            answer[i]=temp[i];
        }
        return answer;
    }
}
