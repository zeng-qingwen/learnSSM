import com.Spring_Mybatis.Dao.UserMapper;
import com.Spring_Mybatis.Pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapper userMapper = (UserMapper)ac.getBean("usermapper");
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindUserByid(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapper userMapper = (UserMapper)ac.getBean("usermapper");
        System.out.println(userMapper.findUserByid(3));
    }

}
