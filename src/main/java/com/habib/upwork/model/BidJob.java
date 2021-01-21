package com.habib.upwork.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bidJob")
public class BidJob {

    @Id
    private int id;
    private String coverLater;
    private String first_name;
    private String last_name;
    private String user_name;
    private String hourlyRate;
    private String chooseAJob;
    private String jobTitle;
    private String category;
    private String description;
    private String projectType;
    private String freelancerLevel;
    private String budgetAmount;
    private String jobDuration;
    private String jobCode;

    public String getChooseAJob() {
        return chooseAJob;
    }

    public void setChooseAJob(String chooseAJob) {
        this.chooseAJob = chooseAJob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverLater() {
        return coverLater;
    }

    public void setCoverLater(String coverLater) {
        this.coverLater = coverLater;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getFreelancerLevel() {
        return freelancerLevel;
    }

    public void setFreelancerLevel(String freelancerLevel) {
        this.freelancerLevel = freelancerLevel;
    }

    public String getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(String budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getJobDuration() {
        return jobDuration;
    }

    public void setJobDuration(String jobDuration) {
        this.jobDuration = jobDuration;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

}
