package ptteng.model.service;

import ptteng.model.domain.User;
public interface UserServiceI {
    /**
     * 添加用户
     * @param user
     */
     void addUser(User user);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(String Id);
}
