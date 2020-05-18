import java.util.LinkedList;
import java.util.Queue;

public class JianZhiOffer033 {
    /*public boolean verifyPostorder(int[] postorder) {
        return sub(postorder,postorder.length-1);
    }
    public boolean sub(int[] postorder,int currentPos){
        if(currentPos==-1){
            return true;
        }
        int left=-1;
        int right=-1;
        boolean flagLeft = false;
        boolean flagRight = false;
        int tmp=postorder[currentPos];
        while(currentPos>0){
            if(!flagLeft && tmp>postorder[currentPos]){
                right = currentPos;
                flagLeft = true;
            }
            if(!flagLeft && tmp<postorder[currentPos]){
                right = currentPos;
                flagLeft = true;
            }
            if(flagLeft && flagRight){
                break;
            }
            currentPos--;

        }

        if(left>right){
            return  false;
        }
        return sub(postorder,left)&&sub(postorder,right);
    }*/

    public boolean verifyPostorder(int[] postorder) {
        return cur(postorder,0,postorder.length-1);

    }
    public boolean cur(int[] postorder, int i,int j){
        if(i>=j){
            return true;
        }
        int m = i;
        while(postorder[m]<postorder[j]){
            m++;
        }
        int n = m;
        while(postorder[n]>postorder[j]){
            n++;
        }
        return n==j && cur(postorder,i,m-1) && cur(postorder,m,j);
    }


}
