package com.SpringAOP.Proxy;

/**
 * 结婚的服务类，
 */
public class You implements Marry{
    @Override
    public void toMarry() {
        System.out.println("我要结婚了");
    }
}
