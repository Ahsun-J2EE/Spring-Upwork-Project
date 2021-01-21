package com.habib.upwork.controller;

import com.habib.upwork.controller.impl.IFreelancerController;
import com.habib.upwork.dao.impl.IFreelancerDAO;
import com.habib.upwork.model.ClientJobs;
import com.habib.upwork.model.Freelancer;
import com.habib.upwork.service.impl.IClientJobService;
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
@RequestMapping(value = "/freelancer")
public class FreelancerController implements IFreelancerController {

    @Autowired
    IFreelancerService freelancerService;

    @Autowired
    IClientJobService cleintJobService;

    @Autowired
    IFreelancerDAO freelancerDAO;

    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/freelancer")
    public ModelAndView hello() {

        return new ModelAndView("freelancer/freelancer");
    }

    @RequestMapping(value = "/jobFeed")
    public ModelAndView hello1() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClientJobs> jobList = cleintJobService.getAll();
        map.put("jobList", jobList);

        return new ModelAndView("/freelancer/jobFeed", "map", map);
    }

    @RequestMapping(value = "/currentJobs")
    public ModelAndView hello2() {
        return new ModelAndView("freelancer/currentJobs");
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView hello3() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Freelancer> fList = freelancerService.getAll();
        map.put("fList", fList);
        return new ModelAndView("freelancer/profile", "map", map);
    }

    @RequestMapping(value = "/createProfile")
    public ModelAndView hello4() {
        return new ModelAndView("freelancer/createProfile");
    }

    @RequestMapping(value = "/proposal")
    public ModelAndView hello5() {
        return new ModelAndView("freelancer/proposal");
    }

    @RequestMapping(value = "/bidJob")
    public ModelAndView hello6() {
        return new ModelAndView("freelancer/bidJob");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        ClientJobs cj = cleintJobService.getById(id);
        map.addAttribute("cj", cj);
        return new ModelAndView("/freelancer/bidJob", "cj", cj);
    }

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public ModelAndView save1(HttpServletRequest request, @RequestParam("profilePicture") MultipartFile file) throws IOException {
        String fullName = request.getParameter("fullName");
        String address = request.getParameter("address");
        String designation = request.getParameter("designation");
        String language = request.getParameter("language");
        String education = request.getParameter("education");
        String skills = request.getParameter("skills");
        String hourlyRate = request.getParameter("hourlyRate");
        String employmentHistory = request.getParameter("employmentHistory");
        String availability = request.getParameter("availability");
        String userType = request.getParameter("userType");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String country = request.getParameter("country");

        if (!file.isEmpty()) {
            String profilepicture = file.getOriginalFilename();
            saveFile(file, profilepicture, "/resources/freelancer/profile");

            Freelancer fr = new Freelancer();
            fr.setFullName(fullName);
            fr.setAddress(address);
            fr.setAvailability(availability);
            fr.setCountry(country);
            fr.setDesignation(designation);
            fr.setEducation(education);
            fr.setEmploymentHistory(employmentHistory);
            fr.setLanguage(language);
            fr.setSkills(skills);
            fr.setFirstName(firstName);
            fr.setLastName(lastName);
            fr.setUserName(userName);
            fr.setUserType(userType);
            fr.setHourlyRate(hourlyRate);
            String profilePicture = file.getOriginalFilename();
            fr.setProfilePicture(profilePicture);
            freelancerDAO.save(fr);
        }
        return new ModelAndView("redirect:/freelancer/profile");
    }

    private void saveFile(MultipartFile file, String fileName, String path) throws IOException {
        System.out.println("Start");
        byte[] bytes = file.getBytes();
        String filePath = servletContext.getRealPath(path);
        File directory = new File(filePath);
        File cFile = new File(
                "C:\\Users\\Mr. Ahsun Habib\\Desktop\\SpringProject\\src\\main\\webapp\\resources\\freelancer\\profile"
                + File.separator + fileName);

        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(cFile));
        stream.write(bytes);
        stream.close();
        System.out.println(cFile);
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/getData/{id}", method = RequestMethod.GET)
    public ModelAndView freelancerEdit(ModelMap map, @PathVariable("id") int id) {
        Freelancer fr = freelancerService.getById(id);
        map.addAttribute("fr", fr);
        return new ModelAndView("/freelancer/profile", "fr", fr);
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
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Freelancer> fList = freelancerService.getAll();
        map.put("fList", fList);
        return new ModelAndView("/freelancer/view", "map", map);
    }
}
