import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hallOfFame=new int[k];
        int min=score[0];
        
        if(k<=score.length){
            for(int i=0;i<k;i++){
                hallOfFame[i]=score[i];
                if(min>score[i]){
                    min=score[i];
                }
                answer[i]=min;
            }

            for(int i=k;i<score.length;i++){
                Arrays.sort(hallOfFame);
                min=hallOfFame[0];
                if(min<score[i]){
                    hallOfFame[0]=score[i];
                }
                Arrays.sort(hallOfFame);
                answer[i]=hallOfFame[0];
            }
        }else{
            for(int i=0;i<score.length;i++){
                hallOfFame[i]=score[i];
                if(min>score[i]){
                    min=score[i];
                }
                answer[i]=min;
            }        
        }
        
        return answer;
    }
}
