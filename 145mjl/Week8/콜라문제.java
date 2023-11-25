class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        do{
            int share=n/a*b;
            int remainder=n-(share/b*a);
            n=share;
            n+=remainder;
            answer+=share;
        }while(n>=a);
        
        
        return answer;
    }
}