package com.dnminh.dao;

import com.dnminh.models.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
    UserModel findByCredentials(String username, String password, Integer status);
}
