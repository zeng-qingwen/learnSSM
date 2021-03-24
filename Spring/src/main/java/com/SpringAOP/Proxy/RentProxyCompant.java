package com.SpringAOP.Proxy;

/**
 * 租房子的代理类
 */
public class RentProxyCompant implements Rent {

    private Rent target;

    public RentProxyCompant(Rent target) {
        this.target = target;
    }

    @Override
    public void rent() {
        before();
        target.rent();
        after();
    }

    private void before(){
        System.out.println("大家注意了，这里有房子出租");
    }

    private void after(){
        System.out.println("请签订合同，欢迎下次合作");
    }
}
