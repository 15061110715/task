package ptteng.model.service.impl;

import ptteng.model.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import ptteng.model.dao.UserMapper;
import ptteng.model.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceI{
    /**
          * 使用@Autowired注解标注userMapper变量，
         * 当需要使用UserMapper时，Spring就会自动注入UserMapper
           */
     @Autowired
     private UserMapper userMapper;//注入dao
    @Override
     public void addUser(User user) {
                 userMapper.insert(user);
             }

    @Override
     public User getUserById(String id) {
                 return userMapper.selectByPrimaryKey(id);
             }
}
