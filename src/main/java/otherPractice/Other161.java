package otherPractice;

public class Other161 {
    public boolean isOneDistance(String s,String t){
        int len1 = s.length();
        int len2 = t.length();
        for (int i = 0; i < Math.min(len1, len2); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(len1==len2){
                    return s.substring(i+1,len1).equals(t.substring(i+1,len2));
                }else if(len1<len2){
                    return s.substring(i,len1).equals(t.substring(i+1,len2));
                }else{
                    return t.substring(i,len2).equals(s.substring(i+1,len1));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Other161 other161 = new Other161();
        System.out.println(other161.isOneDistance("1203","123"));
    }
}
