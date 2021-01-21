package com.habib.upwork.controller;

import com.habib.upwork.controller.impl.IHireController;
import com.habib.upwork.dao.impl.IHireDAO;
import com.habib.upwork.model.BidJob;
import com.habib.upwork.model.Hire;
import com.habib.upwork.service.impl.IBidJobService;
import com.habib.upwork.service.impl.IHireService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

/**
 *
 * @author B4
 */
@RestController
@RequestMapping(value = "hire")
public class HireController implements IHireController {

    @Autowired
    IHireService hireService;

    @Autowired
    IBidJobService bidJobService;

    @Autowired
    ServletContext servletContext;

    @Autowired
    IHireDAO hireDAO;

    @Override
    @RequestMapping(value = "/store/", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("/hire/hireF");
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public ModelAndView save1(HttpServletRequest request, @RequestParam("projectFile") MultipartFile file) throws IOException {
        String coverLater = request.getParameter("coverLater");
        String hourlyRate = request.getParameter("hourlyRate");
        String chooseAJob = request.getParameter("chooseAJob");
        String jobTitle = request.getParameter("jobTitle");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String projectType = request.getParameter("projectType");
        String freelancerLevel = request.getParameter("freelancerLevel");
        String budgetAmount = request.getParameter("budgetAmount");
        String jobDuration = request.getParameter("jobDuration");
        String jobCode = request.getParameter("jobCode");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String startDate = request.getParameter("startDate");
        if (!file.isEmpty()) {
            String projectFile = file.getOriginalFilename();
            saveFile(file, projectFile, "/resources/client/img/hireF");

            Hire hr = new Hire();
            hr.setCoverLater(coverLater);
            hr.setHourlyRate(hourlyRate);
            hr.setChooseAJob(chooseAJob);
            hr.setJobTitle(jobTitle);
            hr.setCategory(category);
            hr.setDescription(description);
            hr.setProjectType(projectType);
            hr.setFreelancerLevel(freelancerLevel);
            hr.setBudgetAmount(budgetAmount);
            hr.setJobDuration(jobDuration);
            hr.setJobCode(jobCode);
            hr.setFirstName(firstName);
            hr.setLastName(lastName);
            hr.setUserName(userName);
            hr.setStartDate(startDate);
            String projectFiles = file.getOriginalFilename();
            hr.setProjectFile(projectFile);
            hireDAO.save(hr);
        }
        return new ModelAndView("redirect:/client/proposals");
    }

    private void saveFile(MultipartFile file, String fileName, String path) throws IOException {
        System.out.println("Start");
        byte[] bytes = file.getBytes();
        String filePath = servletContext.getRealPath(path);
        File directory = new File(filePath);
        File cFile = new File(
                "C:\\Users\\B4\\Desktop\\SpringProject\\src\\main\\webapp\\resources\\client\\img\\hireF"
                + File.separator + fileName);

        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(cFile));
        stream.write(bytes);
        stream.close();
        System.out.println(cFile);
    }

    @RequestMapping(value = "/hireF/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        BidJob bid = bidJobService.getById(id);
        map.addAttribute("bid", bid);
        return new ModelAndView("/hire/hireF", "bid", bid);
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
    public ModelAndView getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
