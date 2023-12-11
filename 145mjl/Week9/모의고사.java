import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        Integer[] pattern1=new Integer[]{1,2,3,4,5};
        Integer[] pattern2=new Integer[]{2,1,2,3,2,4,2,5};
        Integer[] pattern3=new Integer[]{3,3,1,1,2,2,4,4,5,5};
        
        int score1=check(Arrays.asList(pattern1),answers);
        int score2=check(Arrays.asList(pattern2),answers);
        int score3=check(Arrays.asList(pattern3),answers);

        answer=highestScorers(new int[]{score1,score2,score3});
        
        return answer;
    }
    
    public int check(List<Integer> list,int[] arr){//채점
        int score=0;
        for(int i=0,index=0;i<arr.length;i++,index++){ 
            
            if(index==list.size()){
                index=0;
            }
            if(arr[i]==list.get(index)){            
                score++;
            }
        }
        
        return score;
    }
    
    public int[] highestScorers(int[] scores){//최고 득점자 구하여 내림차순 정렬
        
        List<Integer> list=new ArrayList<>();
        int[] keys={1,2,3};
        int max=0;
        
        for(int i=0;i<scores.length;i++){
            if(max<scores[i]){
                max=scores[i];
            }
        }
        
        for(int i=0;i<scores.length;i++){
            if(scores[i]==max){
                list.add(keys[i]);
            }
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
}
