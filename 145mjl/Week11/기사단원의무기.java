import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            answer+=sum(i,limit,power);
        }
        
        return answer;
    }
    
    public int sum(int num,int limit,int power){
        int weightOfIron=0;
        
        weightOfIron=check(num);
        //System.out.println("기사단원 : "+num);
        //System.out.println("약수의 개수 : "+check(num));
        
        if(weightOfIron>limit){
            weightOfIron=power;
        }
        
        return weightOfIron;
    }
    
    public int check(int num){
        int numOfDivisor=0;
        
        
        if(1==num){
            return 1;   
        }
        
        if(2==num){
            return 2;
        }
        
        
        for(int i=2;i<=(int)Math.floor(Math.sqrt(num));i++){
            if(num%i==0){
                numOfDivisor+=2;
            }
        }
        
        int temp=(int)Math.pow(Math.floor(Math.sqrt(num)),2);
        
        //System.out.println(temp);
        
        if(temp==num){
            numOfDivisor--;
        }
        
        numOfDivisor+=2;
        
        return numOfDivisor;
    }
}
