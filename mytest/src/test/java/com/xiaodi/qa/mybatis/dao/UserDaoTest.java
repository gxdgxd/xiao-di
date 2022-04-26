package com.xiaodi.qa.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/26 15:45
 */
public class UserDaoTest {
    @Test
    public void test() {
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.printf(user.toString() + "\n");
        }
        session.close();

    }
}
