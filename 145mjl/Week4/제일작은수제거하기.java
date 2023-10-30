class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
    
        if(arr.length<=1){
            return new int[]{-1};
        }
        
        int index=0;
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }    
        }
        
        answer=new int[arr.length-1];
        for(int i=0,j=0;i<arr.length&&j<arr.length-1;i++,j++){
            if(i==index){
                i++;
            }
            answer[j]=arr[i];
        }
        
        return answer;
    }
}
