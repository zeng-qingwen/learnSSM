package com.UserSpringIOC;

import com.UserSpringIOC.beans.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansTest {

    @Test
    public void TestConstructorInject(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        ConstructorInject constructorInject1 = (ConstructorInject) ac.getBean("ConstructorInject");
        ConstructorInject constructorInject2 = (ConstructorInject) ac.getBean("ConstructorInject");
        System.out.println(constructorInject1.getHello());
        System.out.println(constructorInject2.getHello());
        System.out.println(constructorInject1==constructorInject2);
    }

    @Test
    public void TestHello(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        Hello hello = (Hello) ac.getBean("Hello");
        hello.test();
    }

    @Test
    public void TetsSetInject01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        SetInject01 setInject01 =(SetInject01) ac.getBean("SetInject01");
        System.out.println(setInject01);
        setInject01.test();
    }

    @Test
    public void TestStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

    @Test
    public void TestPCnamespeace(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        PCnamespace cnamespace = (PCnamespace) ac.getBean("Cnamespeace");
        PCnamespace pCnamespace =(PCnamespace) ac.getBean("Pnamespeace");
        System.out.println(cnamespace);
        System.out.println(pCnamespace);
    }

    @Test
    public void TestPeople(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        People people = (People) ac.getBean("people");
        people.getCat().speak();
        people.getDog().speak();
    }

    @Test
    public void TestComponent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("UserSpringIOC/Spring.xml");
        Component1 component = (Component1) ac.getBean("component1");
        System.out.println(component.name);

    }
}
