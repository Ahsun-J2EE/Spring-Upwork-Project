package com.habib.upwork.controller;

import com.habib.upwork.controller.impl.IClientController;
import com.habib.upwork.dao.impl.IClientJobsDAO;
import com.habib.upwork.model.BidJob;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.model.Freelancer;
import com.habib.upwork.service.ClientJobService;
import com.habib.upwork.service.impl.IBidJobService;
import com.habib.upwork.service.impl.IFreelancerService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/client")
public class ClientController implements IClientController {

    @Autowired
    ClientJobService clientJobService;

    @Autowired
    IBidJobService bidJobService;

    @Autowired
    IFreelancerService freelancerService;

    @Autowired
    IClientJobsDAO clientJobsDAO;

    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/client")
    public ModelAndView hello() {
        return new ModelAndView("client/client");
    }

    @RequestMapping(value = "/createJob")
    public ModelAndView hello1() {
        return new ModelAndView("client/createJob");
    }

    @RequestMapping(value = "/postedJobs")
    public ModelAndView hello2() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClientJobs> jobList = clientJobService.getAll();
        map.put("jobList", jobList);
        return new ModelAndView("client/postedJobs", "map", map);
    }

    @RequestMapping(value = "/proposals")
    public ModelAndView hello3() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<BidJob> bidList = bidJobService.getAll();
        map.put("bidList", bidList);
        return new ModelAndView("client/proposals", "map", map);
    }

    @RequestMapping(value = "/hireTalent", method = RequestMethod.GET)
    public ModelAndView hello4() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Freelancer> fList = freelancerService.getAll();
        map.put("fList", fList);
        return new ModelAndView("client/hireTalent", "map", map);
    }

    @RequestMapping(value = "/profile")
    public ModelAndView hello5() {
        return new ModelAndView("client/profile");
    }

    @RequestMapping(value = "/editJob")
    public ModelAndView hello6() {
        return new ModelAndView("/client/editJob");
    }

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {

        return new ModelAndView();
    }

    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public ModelAndView save1(HttpServletRequest request, @RequestParam("additional_file") MultipartFile file) throws IOException {
        String jobeCode = request.getParameter("job_code");
        String jTitle = request.getParameter("job_title");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String project_type = request.getParameter("project_type");
        String freelancer_level = request.getParameter("freelancer_level");
        String budget_amount = request.getParameter("budget_amount");
        String job_duration = request.getParameter("job_duration");
        String client_name = request.getParameter("client_name");

        if (!file.isEmpty()) {
            String additionalFile = file.getOriginalFilename();
            saveFile(file, additionalFile, "/resources/client/jobs");

            ClientJobs cj = new ClientJobs();

            cj.setJob_title(jTitle);
            cj.setJobCode(jobeCode);
            cj.setCategory(category);
            cj.setDescription(description);
            cj.setProject_type(project_type);
            cj.setFreelancer_level(freelancer_level);
            cj.setBudget_Amount(budget_amount);
            cj.setJob_duration(job_duration);
            String additional_files = file.getOriginalFilename();
            cj.setAdditional_file(additionalFile);
            cj.setClient_name(client_name);
            clientJobsDAO.save(cj);
        }
        return new ModelAndView("redirect:/client/postedJobs");
    }

    private void saveFile(MultipartFile file, String fileName, String path) throws IOException {
        System.out.println("Start");
        byte[] bytes = file.getBytes();
        String filePath = servletContext.getRealPath(path);
        File directory = new File(filePath);
        File cFile = new File(
                "C:\\Users\\B4\\Desktop\\SpringProject\\src\\main\\webapp\\resources\\client\\jobs"
                + File.separator + fileName);

        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(cFile));
        stream.write(bytes);
        stream.close();
        System.out.println(cFile);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        ClientJobs cj = clientJobService.getById(id);
        map.addAttribute("cj", cj);
        return new ModelAndView("/client/editJob", "cj", cj);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update1(HttpServletRequest request) {
        ClientJobs c = clientJobService.update(request);
        return new ModelAndView("redirect:/client/postedJobs");
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete1(@PathVariable("id") int id) { //Using @PathVariable by URL
        clientJobService.delete(id);
        return new ModelAndView("redirect:/client/postedJobs");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClientJobs> jobList = clientJobService.getAll();
        map.put("jobList", jobList);
        return new ModelAndView("/freelancer/jobFeed", "map", map);
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
