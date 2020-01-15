package bean;

public class SynchronizedBean {
    private static SynchronizedBean synchronizedBean;

    private SynchronizedBean(){

    }

    //同步代码块和同步方法中
    // 方法可能会有多个线程进来创建对象,
    // 同步代码块,则有锁机制,确保对象的唯一性

    public static SynchronizedBean getSynchronizedBean(){
        if(null==synchronizedBean){
           synchronized (SynchronizedBean.class){
               synchronizedBean=new SynchronizedBean();
           }
        }
        return synchronizedBean;
    }
}
