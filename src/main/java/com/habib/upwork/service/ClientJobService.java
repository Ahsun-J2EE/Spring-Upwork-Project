package com.habib.upwork.service;

import com.habib.upwork.dao.impl.IClientJobsDAO;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.service.impl.IClientJobService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "clientJobService")
public class ClientJobService implements IClientJobService {

    @Autowired
    IClientJobsDAO clientJobsDAO;

    @Override
    public ClientJobs save(HttpServletRequest request) {
        return null;
    }

    @Override
    public ClientJobs update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("job_title");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String project = request.getParameter("project_type");
        String additionalFile = request.getParameter("additional_file");
        String freelancerLevel = request.getParameter("freelancer_level");
        String budgetAmount = request.getParameter("budget_amount");
        String jobDuration = request.getParameter("job_duration");

        ClientJobs cj = new ClientJobs();
        cj.setId(id);
        cj.setJob_title(title);
        cj.setCategory(category);
        cj.setDescription(description);
        cj.setProject_type(project);
        cj.setFreelancer_level(freelancerLevel);
        cj.setAdditional_file(additionalFile);
        cj.setBudget_Amount(budgetAmount);
        cj.setJob_duration(jobDuration);
        return clientJobsDAO.update(cj);
    }

    @Override
    public ClientJobs delete(int id) {
        return clientJobsDAO.delete(id);
    }

    @Override
    public List<ClientJobs> getAll() {
        return clientJobsDAO.getAll();
    }

    @Override
    public ClientJobs getById(int id) {
        return clientJobsDAO.getById(id);
    }

}
