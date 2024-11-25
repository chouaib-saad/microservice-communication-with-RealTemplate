package com.webAvance.backendProject.candidate.Models;

import com.webAvance.backendProject.Company.Models.Job;
import jakarta.persistence.*;

import java.io.File;

@Entity
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_apply;
    @ManyToOne
    @JoinColumn(name = "id_cand")
    private Candidate candidate;  // The candidate who applied

    @ManyToOne
    @JoinColumn(name = "id_job")
    private Job job;  // The job the candidate applied to
    private String cv ;
    private  String stat;

    public Long getId_apply() {
        return id_apply;
    }

    public void setId_apply(Long id_apply) {
        this.id_apply = id_apply;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Apply() {

    }

    public Apply(Long id_apply, Candidate candidate, Job job, String cv, String stat) {
        this.id_apply = id_apply;
        this.candidate = candidate;
        this.job = job;
        this.cv = cv;
        this.stat = stat;
    }
}
