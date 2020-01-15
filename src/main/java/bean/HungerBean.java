package bean;

public final class HungerBean {
    private static HungerBean hungerBean=new HungerBean();

    private HungerBean() {
    }

    public static HungerBean getHungerBean(){
        return hungerBean;
    }
}
