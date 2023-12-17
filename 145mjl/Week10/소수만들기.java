class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(!check(nums[i],nums[j],nums[k])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean check(int num1,int num2,int num3){
        int num=num1+num2+num3;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return true;
            }
        }
        
        //System.out.println("num : "+num+", num1 : "+num1+", num2 : "+num2+", num3 : "+num3);
        return false;
    }
}
