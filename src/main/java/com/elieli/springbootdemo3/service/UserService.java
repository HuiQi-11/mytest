package com.elieli.springbootdemo3.service;

import com.elieli.springbootdemo3.eneity.Result;
import com.elieli.springbootdemo3.eneity.User;
import org.springframework.stereotype.Service;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-24 15:07
 */
@Service
public interface UserService {
    Result regist(User user);
    Result login(User user);
}
