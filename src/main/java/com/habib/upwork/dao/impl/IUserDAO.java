/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.dao.impl;

import com.habib.upwork.common.ICommonDAO;
import com.habib.upwork.model.User;

/**
 *
 * @author Mr. Ahsun Habib
 */
public interface IUserDAO extends ICommonDAO<User> {

    public String checkLogin(String userName, String userPassword);
}
