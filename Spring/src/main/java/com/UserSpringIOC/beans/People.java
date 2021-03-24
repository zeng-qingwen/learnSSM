package com.UserSpringIOC.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自动装配autowrite
 * 先在xml文件中引入
 *      xmlns:context="http://www.springframework.org/schema/context"
 *      xsi:schemaLocation="http://www.springframework.org/schema/context
 *      https://www.springframework.org/schema/context/spring-context.xsd"
 *
 * 然后在<beans>中</beans>添加标签
 *      <context:annotation-config></context:annotation-config>
 *
 * 直接在要使用的地方加上注解
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
}
