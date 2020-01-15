package bean;

public final class HolderBean {

    //通过类加载,创建对象
    private HolderBean(){

    }

    public static class getHolderBean{
        private static HolderBean holderBean=new HolderBean();
    }

    public static HolderBean classgetHolderBean(){
        return getHolderBean.holderBean;
    }

    // 通过加载静态内部类,获取本类对象实例对象
    // 创建静态方法,返回本类对象
}
