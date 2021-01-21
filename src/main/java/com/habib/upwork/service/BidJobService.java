package com.habib.upwork.service;

import com.habib.upwork.dao.impl.IBidJobDAO;
import com.habib.upwork.model.BidJob;
import com.habib.upwork.service.impl.IBidJobService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidJobService implements IBidJobService {
    
    @Autowired
    IBidJobDAO bidJobDAO;
    
    @Override
    public BidJob save(HttpServletRequest request) {
        String coverLater = request.getParameter("coverLater");
        String hourlyRate = request.getParameter("hourlyRate");
        String chooseAJob = request.getParameter("chooseAJob");
        String jobCode = request.getParameter("job_code");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String user_name = request.getParameter("user_name");
        String jobTitle = request.getParameter("job_title");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String projectType = request.getParameter("project_type");
        String freelancerLevel = request.getParameter("freelancer_level");
        String budgetAmount = request.getParameter("budget_amount");
        String jobDuration = request.getParameter("job_duration");
        
        BidJob bj = new BidJob();
        bj.setCoverLater(coverLater);
        bj.setFirst_name(first_name);
        bj.setLast_name(last_name);
        bj.setUser_name(user_name);
        bj.setHourlyRate(hourlyRate);
        bj.setChooseAJob(chooseAJob);
        bj.setJobTitle(jobTitle);
        bj.setCategory(category);
        bj.setDescription(description);
        bj.setProjectType(projectType);
        bj.setFreelancerLevel(freelancerLevel);
        bj.setBudgetAmount(budgetAmount);
        bj.setJobDuration(jobDuration);
        bj.setJobCode(jobCode);
        return bidJobDAO.save(bj);
    }
    
    @Override
    public BidJob update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public BidJob delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<BidJob> getAll() {
        return bidJobDAO.getAll();
    }
    
    @Override
    public BidJob getById(int id) {
        return bidJobDAO.getById(id);
    }
}
