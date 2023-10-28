class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        boolean[] check=new boolean[arr.length];
        int cnt=0;
        int cnt2=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                check[i]=true;
                cnt++;
            }
        }
        
        if(cnt==0){
            answer=new int[]{-1};
            return answer;
        }else{
            answer=new int[cnt];
        }
        
        
        for(int i=0;i<arr.length;i++){
            if(check[i]){
                answer[cnt2++]=arr[i];
            }
            if(cnt2==cnt){
                break;
            }
        }
        
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length-i-1;j++){
                if(answer[j]>answer[j+1]){
                    int temp=answer[j];
                    answer[j]=answer[j+1];
                    answer[j+1]=temp;
                }
            }
        }
        return answer;
    }
}
