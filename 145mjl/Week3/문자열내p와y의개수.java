class Solution {
    boolean solution(String s) {
        int cnt=0;
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++){
            char alphabet=str.charAt(i);
            if(alphabet=='p'){
                cnt++;
            }else if(alphabet=='y'){
                cnt--;
            }
        }
        
        if(cnt==0){
            return true;
        }else{
            return false;
        }
    }
}
