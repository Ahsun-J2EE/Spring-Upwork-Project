package com.habib.upwork.service;

import com.habib.upwork.dao.impl.IUserDAO;
import com.habib.upwork.model.User;
import com.habib.upwork.service.impl.IUserService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO userDAO;

    @Override
    public User save(HttpServletRequest request) {
        String user_type = request.getParameter("user_type");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        String country = request.getParameter("country");

        User ut = new User();
        ut.setUser_type(user_type);
        ut.setFirst_name(first_name);
        ut.setLast_name(last_name);
        ut.setUser_name(user_name);
        ut.setPassword(password);
        ut.setCountry(country);
        return userDAO.save(ut);
    }

    @Override
    public User update(HttpServletRequest request) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
