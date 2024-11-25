package com.webAvance.backendProject.candidate.Service;

import com.webAvance.backendProject.Company.Models.Job;
import com.webAvance.backendProject.candidate.Models.Candidate;
import com.webAvance.backendProject.candidate.Repository.ApplyRepository;
import com.webAvance.backendProject.candidate.Repository.candidateRepository;
import com.webAvance.backendProject.Company.Repository.JobRepository;
import com.webAvance.backendProject.candidate.Models.Apply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class ApplyService {
    @Autowired
    private candidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyRepository applyRepository;

    @Autowired
    private RestTemplate restTemplate;  // Injecting RestTemplate

    @Value("${candidate.service.url}")  // External service URL for candidate service
    private String candidateServiceUrl;

    @Value("${job.service.url}")  // External service URL for job service
    private String jobServiceUrl;

    // Method to apply for a job
    public Apply applyForJob(Long candidateId, Long jobId, Apply apply) {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new RuntimeException("Candidate not found"));
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        apply.setCandidate(candidate);
        apply.setJob(job);

        return applyRepository.save(apply); // Save the new Apply record to the database
    }


    // Method to get all applications by candidate
    public List<Apply> getApplicationsByCandidate(Long candidateId) {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new RuntimeException("Candidate not found"));

        return applyRepository.findByCandidate(candidate);  // Returns all Apply records for this candidate
    }

    // Method to get all candidates who applied for a specific job
    public List<Apply> getApplicationsByJob(Long jobId) {
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        return applyRepository.findByJob(job);  // Returns all Apply records for this job
    }
}
