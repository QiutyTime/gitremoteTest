import com.domain.User;
import com.dao.Iuserdao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author yangtao
 * 　　* @date $date$ $time$
 *
 */
public class mybatisTest {

    InputStream inputStream;
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;
    Iuserdao iuserDao;

    @Before
    public void init()throws IOException {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory，用于加载配置信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        iuserDao=sqlSession.getMapper(Iuserdao.class);
    }

    @After
    public void destory()throws ParseException{
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public  void mybatisTest() {
        List<User> user= iuserDao.findAll();
//        List<User> user =iuserDao.findone(1);
        for (User u:user
        ) {
            System.out.println(u.toString());
        }
    }
    @Test
    public  void save()  {


        User user=new User();
        user.setId("1");
        user.setAge(1);
        user.setName("yangtao");
        user.setUser_name("小金秋");

        iuserDao.save(user);
//
    }
    @Test
    public  void update() {

        User user=new User();
        user.setId("3");
        user.setAge(1);
        user.setName("金秋");
        user.setUser_name("小金秋");
        user.setPassword("123456");
        user.setBirthday(new Date());

        iuserDao.update(user);

    }
    @Test
    public  void delete() {
        iuserDao.delete("1");

    }
    @Test
    public  void findById() {
        User user =iuserDao.findById("1");
        System.out.println(user.toString());


    }
    @Test
    public  void findByName() {
        List<User> user= iuserDao.findByName("%秋%");
        for (User u:user
        ) {
            System.out.println(u.toString());
        }
    }

    @Test
    public  void findtotal() {
        int user= iuserDao.findCount();
        System.out.println(user);
    }



}
