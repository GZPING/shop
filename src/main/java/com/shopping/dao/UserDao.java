package com.shopping.dao;

import com.shopping.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by GD on 2017/9/2.
 */
@Repository
public interface UserDao {
    public User getUser(int id);
}
