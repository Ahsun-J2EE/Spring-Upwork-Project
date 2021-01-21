package com.habib.upwork.controller;

import com.habib.upwork.controller.impl.IUserController;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.model.User;
import com.habib.upwork.service.impl.IClientJobService;
import com.habib.upwork.service.impl.IUserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mr. Ahsun Habib
 */
@RestController
@RequestMapping(value = "user")
public class UserController implements IUserController {

    @Autowired
    IUserService userService;

    @Autowired
    IClientJobService clientJobService;

    @Override

    public ModelAndView create() {

        return null;
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        userService.save(request);
        return new ModelAndView("/home/login");
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest req) {
        return null;
    }
}
