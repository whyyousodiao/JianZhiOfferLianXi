package danlimoshi;

/**
 * @author xikai
 */
public class Singleton {
    /**
     * 饿汉式（推荐）
     */
    /*private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }*/
    /**
     * 懒汉式（不推荐）
     */
    /*private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }*/
    /**
     * 双检查(DCL)（推荐）(不使用volatile的话，在多线程的情况下，可能会出现空指针问题，指令重排序导致)
     */
    /*private volatile static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/
    /**
     * 静态内部类（推荐）
     */
    /*private Singleton(){}
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }*/
    /**
     * 枚举（极力推荐，使用反射不能破坏单例模式，但是可读性不高）
     */
    //枚举第一种
    /*public enum Singleton{
        INSTANCE;
    }*/

    //枚举第二种
    /*public enum SingleObject{
        //指代当前枚举对象的实例，与下方的SingleObject()构造方法对应，
        //如果是INSTANCE(arg)，那么对应的构造函数应该是SingleObject(arg)。
        INSTANCE;

        private final Singleton instance;

        SingleObject(){
            instance = new Singleton();
        }
        private Singleton getInstance(){
            return instance;
        }

    }
    public static Singleton getInstance(){
        return SingleObject.INSTANCE.getInstance();
    }*/

    //枚举第三种
    public interface SingletonInterface {
        void dosth();
    }
    public enum SingletonEnum implements SingletonInterface{
        INSTANCE{
            @Override
            public void dosth() {
                System.out.println("do something");
            }
        };
        public static SingletonInterface getInstance(){
            try{
                return SingletonEnum.INSTANCE;
            }catch (Exception e){
                throw e;
            }

        }
    }


}
