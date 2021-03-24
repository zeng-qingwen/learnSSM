package com.SpringAOP.Proxy;


public class StaticTestMain {
    /**
     * 静态代理调用的过程
     *      1.先定义一个服务类。专注于相关业务
     *      2.再定义一个代理类，将先前定义好的服务类传入
     *      3.调用代理类的方法
     *
     *  静态代理的特点
     *      1.目标角色固定
     *      2.在应用程序之前就应该知道目标角色
     *      3.代理对象可以增强目标对象的行为
     *      1.不同的服务要生成不同的代理类，会使得代理类的数量太多，产生类爆炸（缺点）
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\n--------------------婚介服务---------------------");
        You you = new You();
        MarryProxyCompany marryProxyCompany = new MarryProxyCompany(you);
        marryProxyCompany.toMarry();

        System.out.println("\n--------------------租房服务---------------------");
        Owner owner = new Owner();
        RentProxyCompant rentProxyCompant = new RentProxyCompant(owner);
        rentProxyCompant.rent();
    }
}
