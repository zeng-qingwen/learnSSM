import com.zqw.Dao.UserMapperIml;
import com.zqw.Pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    @Test
    public void TestFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapperIml userMapperIml = ac.getBean("usermapper",UserMapperIml.class);
        List<User> users = userMapperIml.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void TestInsertUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapperIml userMapperIml = ac.getBean("usermapper",UserMapperIml.class);
        User user = new User(1,"刘备","男","打架");
        int a = userMapperIml.insertUser(user);
        if(a==1){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }


}
