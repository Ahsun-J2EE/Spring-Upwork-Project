package com.habib.upwork.dao;

import com.habib.upwork.dao.impl.IBidJobDAO;
import com.habib.upwork.model.BidJob;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BidJobDAO implements IBidJobDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public BidJob save(BidJob bj) {
        sessionFactory.getCurrentSession().save(bj);
        sessionFactory.getCurrentSession().flush();
        return bj;
    }

    @Override
    public BidJob update(BidJob t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BidJob delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BidJob> getAll() {
        String hql = "from BidJob order by id desc";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<BidJob> bidList = q.list();//sessionFactory.getCurrentSession().createCriteria(ClientJobs.class).list();
        sessionFactory.getCurrentSession().flush();
        return bidList;
    }

    @Override
    public BidJob getById(int id) {
        BidJob bid = (BidJob) sessionFactory.getCurrentSession().get(BidJob.class, id);
        sessionFactory.getCurrentSession().flush();
        return bid;
    }

}
