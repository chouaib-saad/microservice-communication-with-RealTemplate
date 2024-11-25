package com.webAvance.backendProject.candidate.Repository;

import com.webAvance.backendProject.Company.Models.Job;
import com.webAvance.backendProject.candidate.Models.Apply;
import com.webAvance.backendProject.candidate.Models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyRepository extends JpaRepository<Apply, Long> {
    // Find all applications by Candidate
    List<Apply> findByCandidate(Candidate candidate);

    // Find all applications by Job
    List<Apply> findByJob(Job job);


}
