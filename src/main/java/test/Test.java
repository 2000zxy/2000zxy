package test;

//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Book;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Company: 宝鸡大学
 * @author: 大宝
 * @date: 2021/3/14
 * @time: 19:25
 */
public class Test {
    public static void main(String[] args) {
        try {
            InputStream is = Resources.getResourceAsStream("mybaties-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(is);
            SqlSession session = factory.openSession();
            Book list = session.selectOne("test.select_book",1);
            System.out.println(list);
            System.out.println(session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
