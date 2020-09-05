package bishiti.ali;

public class Ali002 {
    /*
    * 最大收藏品价值问题
    * */
    public int cur(int[][] a,int n,int m) {
        int[][] nums = new int[n][m];

        int pre, rear;
        for (int i = 0; i < n; i++) {
            int len = a[i].length;
            rear = 0;
            pre = 0;
            for (int j = 0, k = 0; j < len; j++) {
                if (pre < rear) {
                    if (a[i][pre] < a[i][rear]) {
                        if(i==0){
                            nums[i][j] = a[i][pre];
                        }else{
                            nums[i][j] = nums[i][j-1] + a[i][pre];
                        }
                        pre++;
                    } else {
                        if(i==0){
                            nums[i][j] = a[i][rear];
                        }else{
                            nums[i][j] = nums[i][j-1] + a[i][rear];
                        }
                        rear--;
                    }
                } else {
                    if(i==0){
                        nums[i][j] = a[i][pre];
                    }else{
                        nums[i][j] = nums[i][j-1] + a[i][pre];
                    }
                    break;
                }
            }
        }
        int[][] res = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
        }

        return res[n][m];

    }
}
