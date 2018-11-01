package com.wt.shiro.service;

import com.wt.shiro.entity.User;

/**
 * @author WangTao
 *         Created at 18/9/3 下午4:43.
 */
public interface UserService {

    void addUser(User user);

    User findByUsername(String username);

}
