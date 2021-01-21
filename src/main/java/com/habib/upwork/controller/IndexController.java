/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mr. Ahsun Habib
 */
@RestController
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView hello() {
        return new ModelAndView("home/index");
    }

    @RequestMapping("/aboutUs")
    public ModelAndView hello1() {
        return new ModelAndView("home/aboutUs");
    }

    @RequestMapping("/login")
    public ModelAndView hello2() {
        return new ModelAndView("home/login");
    }

    @RequestMapping("/signup")
    public ModelAndView hello3() {
        return new ModelAndView("home/signup");
    }

    @RequestMapping("/cdashboard")
    public ModelAndView hello4() {
        return new ModelAndView("home/cdashboard");
    }

    @RequestMapping("/blog")
    public ModelAndView hello5() {
        return new ModelAndView("home/blog");
    }

    @RequestMapping("/contact")
    public ModelAndView hello6() {
        return new ModelAndView("home/contact");
    }

}
