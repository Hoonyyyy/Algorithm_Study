class Solution {
    public int[] solution(String s) {
        //대상 문자열 , 찾을 문자
        //"" , b
        //b , a
        //ba , n
        //ban , a
        //bana ,n
        //banan , a

        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int index=s.lastIndexOf(s.charAt(i),i-1);//대상문자의 앞에서 찾음
            if(index!=-1){
                answer[i]=i-index;//몇 칸 앞인지 표현
            }else{
                answer[i]=index;//자신의 앞에 같은 글자 없음
            }
            
        }
        
        return answer;
    }
}
