import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int horizontalMax=0;
        int verticalMax=0;
        for(int i=0;i<sizes.length;i++){
            int[] temp=sizes[i];
            Arrays.sort(temp);
            if(horizontalMax<temp[0]){
                horizontalMax=temp[0];
            }
            if(verticalMax<temp[1]){
                verticalMax=temp[1];
            }
        }
        //System.out.println("h : "+horizontalMax);
        //System.out.println("v : "+verticalMax);
        answer=horizontalMax*verticalMax;
        
        return answer;
    }
}
