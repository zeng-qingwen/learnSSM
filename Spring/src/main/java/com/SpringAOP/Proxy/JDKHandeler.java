package com.SpringAOP.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理类
 */
public class JDKHandeler implements InvocationHandler {

//    目标对象，类型是动态的，不是固定的，通过带参构造器传入
    private Object target;
    public JDKHandeler(Object target) {
        this.target = target;
    }

    /**
     * 代理类执行代理对象的对应方法
     * 1.调用目标对象的方法
     * 2.对目标对象的增强行为
     * @param proxy 调用该方法的代理实例
     * @param method 目标对象的方法
     * @param args  目标对象方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();//        增强行为
        Object object  =method.invoke(target,args);//        调用目标对象的方法
        after();//        增强行为
        return object;
    }

    private void before(){
        System.out.println("目标对象方法执行前+++++++++++++++");
    }
    private void after(){
        System.out.println("目标对象方法执行后+++++++++++++++");
    }


    /**
     * public static Object newProxyInstance(ClassLoader loader,
     *                                       Class<?>[] interfaces,
     *                                       InvocationHandler h)
     *
     * 参数如下
     * loader:           类加载器                                      this.getClass().getClassLoader()
     * interfaces：      目标对象的接口数组                             target.getClass().getInterfaces()
     * h:                InvocationHandler接口（传入接口的实现类即可）   this
     *
     * 获取代理类
     * @return
     */
    public Object getProxy(){
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

        return object;
    }
}
