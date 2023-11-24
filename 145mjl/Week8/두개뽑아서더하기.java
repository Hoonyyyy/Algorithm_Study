import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }    
        }
        
        Integer[] integerArray=set.toArray(new Integer[set.size()]);
    
        answer=Arrays.stream(integerArray)
                    .mapToInt(i->i)
                    .toArray();
        
        return answer;
    }
}
