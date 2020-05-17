public class JianZhiOffer029 {
    public int[] spiralOrder(int[][] matrix) {
        int len = matrix.length;
        int width = matrix[0].length;
        int maxlen = len * width;
        int[] res = new int[maxlen];
        int l = 0, t = 0, r = width-1, b = len-1;
        int index=0;
        while(true){
            for(int i = l;i<=r;i++){res[index++]=matrix[t][i];}
            if(++t > b){break;}
            for(int i = t;i<=b;i++){res[index++]=matrix[i][r];}
            if(--r < l){break;}
            for(int i = r;i>=l;i--){res[index++]=matrix[b][i];}
            if(--b < t){break;}
            for(int i = b;i>=t;i--){res[index++]=matrix[i][l];}
            if(++l > r){break;}
        }
        return res;
    }

    public static void main(String[] args) {
        int i=1;
        if(++i>1){
            System.out.println("true");
        }
    }

}
