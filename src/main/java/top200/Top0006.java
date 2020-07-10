package top200;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Top0006 {
    public String convert(String s, int numRows) {
        if(numRows<=1) {
            return s;
        }

        int step = (numRows-1)*2;

        int len = s.length();
        int innerStep = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            innerStep = step-(step+2*i)%step;
            for(int j=i;j<len;j+=step){
                if(innerStep==step){
                    stringBuffer.append(s.charAt(j));
                }else{
                    stringBuffer.append(s.charAt(j));
                    if(j+innerStep<len){
                        stringBuffer.append(s.charAt(j));
                    }
                }
            }

        }

        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        Top0006 top0006 = new Top0006();
        System.out.println(top0006.convert("PAYPALISHIRING",4));
    }
}
