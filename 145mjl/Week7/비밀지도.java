class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] arr1Square=convertTo2Digit(n,arr1);
        int[][] arr2Square=convertTo2Digit(n,arr2);
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=arr1Square[i][j]+arr2Square[i][j];
                if(temp==0){
                    sb.append(" ");
                }else{
                    sb.append("#");
                }
            }
            answer[i]=sb.toString();
            sb.delete(0,sb.length());
        }
        
        
        return answer;
    }
    
    public int[][] convertTo2Digit(int n,int[] arr){
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][n-1-j]=arr[i]%2;
                arr[i]/=2;
                if(arr[i]==0){
                    break;
                }
            }
        }
        return result;
    }
}
