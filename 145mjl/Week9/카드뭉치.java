import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        LinkedList<String> queue1=new LinkedList<>();
        LinkedList<String> queue2=new LinkedList<>();
        for(String c1:cards1){
            queue1.add(c1);//push(X) add(O)
          //push : Pushes an element onto the stack represented by this list.
          //add : Appends the specified element to the end of this list.
        }
        for(String c2:cards2){
            queue2.add(c2);
        }
        
        for(String s:goal){
            if(s.equals(queue1.peekFirst())){
                queue1.poll();
            }else if(s.equals(queue2.peekFirst())){
                queue2.poll();
            }else{
                return "No";
            }
        }
        
        return "Yes";

    }
}
