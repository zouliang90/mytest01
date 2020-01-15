package bean;

public final class LazyBean {
    private static LazyBean lazyBean;

    private LazyBean(){

    }

    public static LazyBean getLazyBean(){
        if(null==lazyBean){
            lazyBean=new LazyBean();
        }
        return lazyBean;
    }
}
