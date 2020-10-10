package bishiti.jingdong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
And millionaires will hold 46% of total wealth by 2019, the report says. This ratio is likely to increase in 2020.
 */

public class Jingdong2020091701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String regex = "[0-9]*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            while(matcher.find()){
                String tmp = matcher.group();
                if(tmp.length()==4){
                    int year = Integer.valueOf(tmp);
                    if(year>=1000 && year<=3999){
                        System.out.print(year+" ");
                    }
                }
            }
        }
    }
}
