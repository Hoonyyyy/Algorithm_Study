class Solution {
    public long solution(long n) {
        int max=(int)(Math.sqrt(50000000000000L));//L을 붙여줘야 함
        
        for(int i=1;i<=max;i++){
            if(n==(long)i*i){//형변환 필요
                return (long)(i+1)*(i+1);//형변환 필요
            }
        }
        return -1;
    }
}
