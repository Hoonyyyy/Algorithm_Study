class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int input=x;
        int sum=0;
        do{
            sum+=input%10;
            input/=10;
        }while(input>0);
        if(x%sum!=0){
            answer=false;
        }
        return answer;
    }
}
