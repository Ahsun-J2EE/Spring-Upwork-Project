/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.dao;

import com.habib.upwork.dao.impl.IHireDAO;
import com.habib.upwork.model.BidJob;
import com.habib.upwork.model.Hire;
import com.habib.upwork.service.impl.IHireService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author B4
 */
@Repository
@Transactional
public class HireDAO implements IHireDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    IHireService hireService;

    @Override
    public Hire save(Hire t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Hire update(Hire t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hire delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Hire> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hire getById(int id) {
        BidJob bid = (BidJob) sessionFactory.getCurrentSession().get(BidJob.class, id);
        sessionFactory.getCurrentSession().flush();
        return hireService.getById(id);
    }

}
