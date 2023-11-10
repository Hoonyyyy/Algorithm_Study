import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        LinkedList<Integer> list=new LinkedList<>();
        
        int index=s.indexOf(" ");
        while(index!=-1){
            list.add(index);
            index=s.indexOf(" ",list.getLast()+1);
            //System.out.println(list.getLast());
        }
        
        String[] strArr=s.split(" ");
        //System.out.println(Arrays.toString(strArr));

        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<strArr.length;i++){
            for(int j=0;j<strArr[i].length();j++){
                String temp=strArr[i].substring(j,j+1);
                if(j%2==0){
                    temp=temp.toUpperCase();
                }else{
                    temp=temp.toLowerCase();
                }
                //System.out.println(temp);
                sb.append(temp);
                    
            }
        }
        
        while(!list.isEmpty()){
            sb.insert(list.poll()," ");
            //System.out.println(sb);
        }
        
        answer=sb.toString();
        return answer;
    }
}
