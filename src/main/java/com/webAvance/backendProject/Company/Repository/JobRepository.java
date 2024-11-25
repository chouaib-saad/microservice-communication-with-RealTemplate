package com.webAvance.backendProject.Company.Repository;

import com.webAvance.backendProject.Company.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {


}
