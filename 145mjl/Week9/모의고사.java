class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        //12345,21232425,3311224455
        int[] pattern1=new int[]{1,2,3,4,5};
        int[] pattern2=new int[]{2,1,2,3,2,4,2,5};
        int[] pattern3=new int[]{3,3,1,1,2,2,4,4,5,5};
        int score1=countScore(answers,pattern1);
        int score2=countScore(answers,pattern2);
        int score3=countScore(answers,pattern3);

        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        return answer;
    }
    
    public int countScore(int[] answers,int[] pattern){
        int score=0;
        if(answers.length>=pattern.length){
            for(int i=0;i<answers.length;i+=pattern.length){
                for(int j=i;j<pattern.length;j++){
                    if(answers[j]==pattern[j]){
                        score+=1;
                    }
                }
            }
        }else{
            for(int i=0;i<answers.length;i++){
                if(answers[i]==pattern[i]){
                    score+=1;
                }
            }
        }
        

        return score;
    }
}
