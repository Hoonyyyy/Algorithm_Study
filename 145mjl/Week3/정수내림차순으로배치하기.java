class Solution {
    public long solution(long n) {
        long answer=0L;
        int count=0;
        long[] arr=new long[10];
        do{
            arr[count++]=n%10;
            n/=10;
        }while(n>0L);
        
        for(int i=0;i<count;i++){
            for(int j=0;j<count-1;j++){
                if(arr[j]<arr[j+1]){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        
        
        for(int i=0;i<count;i++){
            answer+=arr[count-i-1]*(long)Math.pow(10,i);
        }
        return answer;
    }
}
