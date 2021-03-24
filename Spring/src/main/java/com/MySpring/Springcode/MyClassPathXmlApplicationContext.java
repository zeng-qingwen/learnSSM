package com.MySpring.Springcode;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Spring IOC核心技术
 * 1. 工厂设计模式（ 简单工厂  工厂方法  抽象工厂）
 * 2. xml解析（Dom4j）
 * 3. 反射技术（实例化对象  反射获取方法 反射获取属性 反射获取构造器  反射调用方法）
 * 4. 策略模式（加载资源）
 * 5. 单例模式（IOC创建实例化对象）
 */
public class MyClassPathXmlApplicationContext implements MyFactory {
    private List<MyBean> beanList = new ArrayList<>();
    private Map<String,Object> beanMap = new HashMap<>();


//    构造方法获取xml中的id和class信息,实例化xml中配置得class
    public MyClassPathXmlApplicationContext(String fileName) {
        this.parseXml(fileName);
        this.instanceBean();
    }

//    解析XML文档 把消xml文档中的信息封装到Mybean对象中保存在beanlist集合中
    private void parseXml(String fileName){
        SAXReader saxReader = new SAXReader();
        URL url = this.getClass().getClassLoader().getResource(fileName);
        try{
            Document document = saxReader.read(url);
            XPath xPath =document.createXPath("beans/bean");
            List<Element> elementList = xPath.selectNodes(document);
            if(elementList!=null&&elementList.size()>0){
                for (Element el :elementList) {
                    String id = el.attributeValue("id");
                    String clazz = el.attributeValue("class");
                    MyBean myBean = new MyBean(id,clazz);
                    beanList.add(myBean);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    通过反射得分方式获取到类的基本信息,读取beanlist集合里面Mybean得信息,实例化对象和id一起保存在beanMap中
    private  void instanceBean(){
        
        if(beanList!=null&&beanList.size()>0){
            for (MyBean bean:beanList) {
                String id = bean.getId();
                String clazz = bean.getClazz();
                try{
                    Object object = Class.forName(clazz).newInstance();
                    beanMap.put(id,object);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


//通过id读取beanMap中得object对象,返回
    @Override
    public Object getbean(String id) {
        return beanMap.get(id);
    }
}
