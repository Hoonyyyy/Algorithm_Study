class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        int countSum=0;
        for(int i=1;i<=count;i++){
            countSum+=i;
        }
        
        //money-=countSum*price;
        long lackOfMoney=(long)countSum*price-money;
        
        if(lackOfMoney<=0){
            answer=0;
        }else{
            answer=lackOfMoney;
        }
        
        return answer;
    }
}
