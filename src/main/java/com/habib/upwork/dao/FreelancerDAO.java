package com.habib.upwork.dao;

import com.habib.upwork.dao.impl.IFreelancerDAO;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.model.Freelancer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class FreelancerDAO implements IFreelancerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Freelancer save(Freelancer t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Freelancer update(Freelancer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Freelancer delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Freelancer> getAll() {
        String hql = "from Freelancer order by id desc";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Freelancer> fList = q.list();//sessionFactory.getCurrentSession().createCriteria(ClientJobs.class).list();
        sessionFactory.getCurrentSession().flush();
        return fList;
    }

    @Override
    public Freelancer getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
