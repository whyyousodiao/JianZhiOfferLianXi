package sort;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestSorttttttttt {
    public void testSort(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class clazz = obj.getClass();
        Method[] methods = clazz.getMethods();
        int[] array = {8,5,6,7,4,3,5,2,9,1};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = {1,2,3,4,6,5,7,8,9,10};
        int res;
        Method method = clazz.getDeclaredMethod("sort",int[].class);
        if(method!=null){
            System.out.println("第1组");
            for(int n:(int[])method.invoke(clazz.newInstance(),array)){
                System.out.print(n+"\t");
            }
            System.out.println("");
            System.out.println("第2组");
            for(int n:(int[])method.invoke(clazz.newInstance(),array2)){
                System.out.print(n+"\t");
            }
            System.out.println("");
            System.out.println("第3组");
            for(int n:(int[])method.invoke(clazz.newInstance(),array3)){
                System.out.print(n+"\t");
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /*new TestSorttttttttt().testSort(new PopSort());*/
        /*new TestSorttttttttt().testSort(new InsertSort());*/
        /*new TestSorttttttttt().testSort(new ShellSort());*/
        /*new TestSorttttttttt().testSort(new MergeSort());*/
        /*new TestSorttttttttt().testSort(new FastSort());*/
        /*new TestSorttttttttt().testSort(new HeapSort());*/
        new TestSorttttttttt().testSort(new CountSort());
    }

}
