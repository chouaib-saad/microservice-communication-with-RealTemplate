package com.webAvance.backendProject.candidate.Repository;


import com.webAvance.backendProject.candidate.Models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface candidateRepository extends JpaRepository<Candidate, Long> {


}
