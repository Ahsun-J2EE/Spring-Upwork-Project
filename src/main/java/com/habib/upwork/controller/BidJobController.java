package com.habib.upwork.controller;

import com.habib.upwork.controller.impl.IBidJobController;
import com.habib.upwork.dao.impl.IBidJobDAO;
import com.habib.upwork.model.BidJob;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.service.impl.IBidJobService;
import com.habib.upwork.service.impl.IClientJobService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/bid")
public class BidJobController implements IBidJobController {

    @Autowired
    IBidJobService bidJobService;

    @Autowired
    IBidJobDAO bidJobDAO;

    @Autowired
    IClientJobService clientJobService;

    @RequestMapping(value = "bidJob/{id}")
    public ModelAndView hello(ModelMap map, @PathVariable("id") int id) {
        ClientJobs cj = clientJobService.getById(id);
        map.addAttribute("cj", cj);
        return new ModelAndView("/bid/bidJob", "cj", cj);
    }

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        bidJobService.save(request);
        return new ModelAndView("/bid/bidJob");
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
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
     @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<BidJob> bidList = bidJobService.getAll();
        map.put("bidList", bidList);
        return new ModelAndView("/client/proposals", "map", map);
    }

}
