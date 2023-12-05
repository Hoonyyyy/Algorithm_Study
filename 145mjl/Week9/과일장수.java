import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] temp=Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(temp,new Comparator<Integer>(){
            @Override
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        });
        
        
        // for(int i:temp){
        //     System.out.println("i : "+i);
        // }
        
        LinkedList<Integer> list=new LinkedList<>();
        
        for(int i:temp){
            list.add(i);
        }

        while(list.size()>=m){
            for(int i=0;i<m;i++){
                if(i==m-1){
                    answer+=list.peekFirst()*m;
                    //System.out.println(answer);
                }
                list.pollFirst();
            }
        }
        
        return answer;
    }
}
