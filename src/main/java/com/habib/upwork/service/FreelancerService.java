package com.habib.upwork.service;

import com.habib.upwork.dao.impl.IFreelancerDAO;
import com.habib.upwork.model.Freelancer;
import com.habib.upwork.service.impl.IFreelancerService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreelancerService implements IFreelancerService {

    @Autowired
    IFreelancerDAO freelancerDAO;

    @Override
    public Freelancer save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Freelancer update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Freelancer delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Freelancer> getAll() {
        return freelancerDAO.getAll();
    }

    @Override
    public Freelancer getById(int id) {
        return freelancerDAO.getById(id);
    }

}
