/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.dao;

import com.habib.upwork.dao.impl.IUserDAO;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mr. Ahsun Habib
 */
@Repository
@Transactional
public class UserDAO implements IUserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User save(User t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public User update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(int id) {
        User usr = (User) sessionFactory.getCurrentSession().get(User.class, id);
        sessionFactory.getCurrentSession().flush();
        return usr;
    }

    @Override
    public String checkLogin(String userName, String userPassword) {
        Session session = sessionFactory.openSession();
        String SQL_QUERY = " from User where user_name=? and Password=?";
        Query query = session.createQuery(SQL_QUERY);
        User u = (User) query.list();
        if (userPassword == u.getPassword()) {
        }
        return null;
    }

}
