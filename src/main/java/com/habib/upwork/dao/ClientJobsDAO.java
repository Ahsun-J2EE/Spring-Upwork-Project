/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.habib.upwork.dao;

import com.habib.upwork.dao.impl.IClientJobsDAO;
import com.habib.upwork.model.ClientJobs;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mr. Ahsun Habib
 */
@Repository(value = "clientJobsDAO")
@Transactional
public class ClientJobsDAO implements IClientJobsDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ClientJobs save(ClientJobs t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ClientJobs update(ClientJobs t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ClientJobs delete(int id) {
        ClientJobs jobs = (ClientJobs) sessionFactory.getCurrentSession().load(ClientJobs.class, id);
        sessionFactory.getCurrentSession().delete(jobs);
        return jobs;
    }

    @Override
    public List<ClientJobs> getAll() {
        String hql = "from ClientJobs order by id desc";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<ClientJobs> jobList = q.list();//sessionFactory.getCurrentSession().createCriteria(ClientJobs.class).list();
        sessionFactory.getCurrentSession().flush();
        return jobList;
    }

    @Override
    public ClientJobs getById(int id) {
        ClientJobs t = (ClientJobs) sessionFactory.getCurrentSession().get(ClientJobs.class, id);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

}
