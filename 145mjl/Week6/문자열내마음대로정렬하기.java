import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list=Arrays.asList(strings);
        Collections.sort(list);
        Collections.sort(list,new Comparator<String>(){
            public int compare(String o1,String o2){
                int string1=(int)o1.charAt(n);
                int string2=(int)o2.charAt(n);
                return string1-string2;
            }
        });
        String[] answer=list.toArray(new String[list.size()]);
        return answer;
    }
}
