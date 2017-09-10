package com.shopping.service.iplm;

import com.shopping.dao.UserDao;
import com.shopping.domain.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by GD on 2017/9/2.
 */
@Service
@Transactional
public class UserServiceIplm implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User loginUser(int id) throws Exception {
        return userDao.getUser(id);
    }
}
