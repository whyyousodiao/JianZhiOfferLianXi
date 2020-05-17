import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JianZhiOffer020 {

    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        System.out.println(solution.isNumber("1 "));
    }

}


class Solution20 {
    public boolean isNumber(String s) {
        HashMap map = new HashMap<String, Integer>();
        map.put("sign",0);
        map.put("num",1);
        map.put("dot",2);
        map.put("eee",3);
        map.put("blank",4);
        map.put("else",5);
        List<Integer> legalState=new ArrayList<Integer>(){{
            add(2);
            add(5);
            add(7);
            add(9);
        }};
        int[][] trans = {{1,2,-1,-1,0,-1},
                {-1,2,-1,-1,-1,-1},
                {-1,2,3,4,9,-1},
                {-1,5,-1,-1,-1,-1},
                {6,7,-1,-1,-1,-1},
                {-1,5,-1,4,9,-1},
                {-1,7,-1,-1,-1,-1},
                {-1,7,8,-1,9,-1},
                {-1,9,-1,-1,-1,-1},
                {-1,9,-1,-1,9,-1}};
        int len = s.length();

        boolean res =false;
        int[] transArray = new int[len+1];
        transArray[0] = 0;
        int index =1;
        while(index<=len){
            transArray[index]=trans[transArray[index-1]][(Integer) map.get(getC(s.charAt(index-1)))];
           if(transArray[index]==-1){
               return false;
           }
            index++;
        }
        if(legalState.contains(transArray[index-1]))return true;
        return false;
    }

    public String getC(char c){
        if(c=='+' || c=='-'){
            return "sign";
        }
        if(c>='0' && c<='9'){
            return "num";
        }
        if(c == '.'){
            return "dot";
        }
        if(c == 'e' || c=='E'){
            return "eee";
        }
        if (c== ' '){
            return "blank";
        }
        return "else";
    }
}

