package test;

import bean.HolderBean;

public class BeanTet {
    public static void main(String[] args) {
        HolderBean holderBean1 = HolderBean.classgetHolderBean();
        HolderBean holderBean2 = HolderBean.classgetHolderBean();
        System.out.println(holderBean1==holderBean2);

    }
}
