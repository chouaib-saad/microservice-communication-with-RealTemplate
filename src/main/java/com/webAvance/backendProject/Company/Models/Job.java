package com.webAvance.backendProject.Company.Models;

import com.webAvance.backendProject.candidate.Models.Apply;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jobs;
    private Long id_comp;
    private String title_jobs;
    private String desc_jobs;
    private String competences;
    private String type_job;
    private String location_job;
    private String education_level;
    private String salery;
    private LocalDate date_posted;
    private LocalDate date_expired;

    /*@OneToMany(mappedBy = "job")
    private List<Apply> applications;  // List of candidates who have applied for the job

    public List<Apply> getApplications() {
        return applications;
    }

    public void setApplications(List<Apply> applications) {
        this.applications = applications;
    }
*/
    // Default constructor
    public Job() {
    }

    // Constructor with all properties
    public Job(Long id_comp, String title_jobs, String desc_jobs, String competences,
               String type_job, String location_job, String education_level,
               String salery, LocalDate date_posted, LocalDate date_expired) {
        this.id_comp = id_comp;
        this.title_jobs = title_jobs;
        this.desc_jobs = desc_jobs;
        this.competences = competences;
        this.type_job = type_job;
        this.location_job = location_job;
        this.education_level = education_level;
        this.salery = salery;
        this.date_posted = date_posted;
        this.date_expired = date_expired;
    }

    // Getters and setters
    public Long getId_jobs() {
        return id_jobs;
    }

    public void setId_jobs(Long id_jobs) {
        this.id_jobs = id_jobs;
    }

    public Long getId_comp() {
        return id_comp;
    }

    public void setId_comp(Long id_comp) {
        this.id_comp = id_comp;
    }

    public String getTitle_jobs() {
        return title_jobs;
    }

    public void setTitle_jobs(String title_jobs) {
        this.title_jobs = title_jobs;
    }

    public String getDesc_jobs() {
        return desc_jobs;
    }

    public void setDesc_jobs(String desc_jobs) {
        this.desc_jobs = desc_jobs;
    }

    public String getCompetences() {
        return competences;
    }

    public void setCompetences(String competences) {
        this.competences = competences;
    }

    public String getType_job() {
        return type_job;
    }

    public void setType_job(String type_job) {
        this.type_job = type_job;
    }

    public String getLocation_job() {
        return location_job;
    }

    public void setLocation_job(String location_job) {
        this.location_job = location_job;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getSalery() {
        return salery;
    }

    public void setSalery(String salery) {
        this.salery = salery;
    }

    public LocalDate getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(LocalDate date_posted) {
        this.date_posted = date_posted;
    }

    public LocalDate getDate_expired() {
        return date_expired;
    }

    public void setDate_expired(LocalDate date_expired) {
        this.date_expired = date_expired;
    }
}
