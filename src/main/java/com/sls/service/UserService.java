package com.sls.service;

import com.sls.domain.User;
import com.sls.repository.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sls
 **/
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer saveUser(User user) {
        return userDao.saveUser(user);
    }

    /**
     * 查询所有用户
     * @return 用户列表
     */
    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 修改用户
     * @param id id
     * @param userName 用户名
     * @param userAge 用户年龄
     * @return 返回更新的id
     */
    public Integer updateUser(Integer id, String userName, Integer userAge) {
        return userDao.updateUser(id,userName,userAge);
    }

    /**
     * 删除用户
     * @param userId 用户id
     * @return 数量
     */
    public Integer deleteUser(Integer userId) {
        return userDao.deleteUser(userId);
    }
}
