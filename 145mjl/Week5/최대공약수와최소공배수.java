class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int[] temp=new int[n];
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0&&m%i==0){
                temp[cnt++]=i;
                //System.out.println(cnt+"번째 공약수 "+i);
            }
        }
        
        int max=temp[cnt-1];
        int min=max*(n/max)*(m/max);
        
        answer=new int[]{max,min};
        return answer;
    }
}
