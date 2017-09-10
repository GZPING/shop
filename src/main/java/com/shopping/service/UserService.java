package com.shopping.service;

import com.shopping.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by GD on 2017/9/2.
 */

public interface UserService {
    public User loginUser(int id)throws  Exception;
}
