package com.SpringAOP.Proxy;

/**
 * 租房子的目标对象
 */
public class Owner implements Rent{

    @Override
    public void rent() {
        System.out.println("我要出租房子，两室一厅，3000一个月");
    }
}
