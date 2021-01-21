/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mr. Ahsun Habib
 */
public interface ICommonController<T> {

    public ModelAndView create();

    public ModelAndView save(HttpServletRequest request);

    public ModelAndView edit(int id);

    public ModelAndView update(HttpServletRequest request);

    public ModelAndView delete(int id);

    public ModelAndView getAll();
}
