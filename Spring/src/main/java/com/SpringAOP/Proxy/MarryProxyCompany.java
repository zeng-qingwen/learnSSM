package com.SpringAOP.Proxy;

/**
 * 静态代理类的实现
 */
public class MarryProxyCompany implements Marry {

    //定义一个服务类
    private Marry target;

    //构造器获取服务类
    public MarryProxyCompany(You target) {
        this.target = target;
    }

    /**
     * 通过调用传递进来的服务类的方法实现了toMarry方法，可以在不改变服务类源代码
     * 的情况下对toMarry方法进行增强
     */
    @Override
    public void toMarry() {
        before();
        target.toMarry();
        after();
    }

    //增强的方法before
    private void  before(){
        System.out.println("结婚前的场地布置中");
    }

    //增强的方法after
    private void after(){
        System.out.println("结婚仪式完毕，祝愿新人百年好合！");
    }
}
