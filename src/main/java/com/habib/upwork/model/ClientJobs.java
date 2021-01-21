package com.habib.upwork.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientjobs")
public class ClientJobs {

    @Id
    private int id;
    private String job_title;
    private String category;
    private String description;
    private String project_type;
    private String freelancer_level;
    private String budget_Amount;
    private String job_duration;
    private String additional_file;
    private String jobCode;
    private String client_name;

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public int getId() {
        return id;
    }

    public String getAdditional_file() {
        return additional_file;
    }

    public void setAdditional_file(String additional_file) {
        this.additional_file = additional_file;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
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

    public String getProject_type() {
        return project_type;
    }

    public void setProject_type(String project_type) {
        this.project_type = project_type;
    }

    public String getFreelancer_level() {
        return freelancer_level;
    }

    public void setFreelancer_level(String freelancer_level) {
        this.freelancer_level = freelancer_level;
    }

    public String getBudget_Amount() {
        return budget_Amount;
    }

    public void setBudget_Amount(String budget_Amount) {
        this.budget_Amount = budget_Amount;
    }

    public String getJob_duration() {
        return job_duration;
    }

    public void setJob_duration(String job_duration) {
        this.job_duration = job_duration;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

}
