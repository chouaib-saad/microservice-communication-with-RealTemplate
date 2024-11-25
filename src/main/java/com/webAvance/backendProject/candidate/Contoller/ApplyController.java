package com.webAvance.backendProject.candidate.Contoller;

import com.webAvance.backendProject.candidate.Models.Apply;
import com.webAvance.backendProject.candidate.Service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    // Endpoint to apply for a job
    @PostMapping("/applyJob/{candidateId}/{jobId}")
    public ResponseEntity<Apply> applyForJob(@PathVariable Long candidateId, @PathVariable Long jobId, @RequestBody Apply apply) {
        Apply newApply = applyService.applyForJob(candidateId, jobId, apply);
        return new ResponseEntity<>(newApply, HttpStatus.CREATED);
    }


    // Endpoint to get all applications by a candidate
    @GetMapping("/candidate/{candidateId}")
    public ResponseEntity<List<Apply>> getApplicationsByCandidate(@PathVariable Long candidateId) {
        List<Apply> applications = applyService.getApplicationsByCandidate(candidateId);
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }

    // Endpoint to get all candidates who applied for a specific job
    @GetMapping("/job/{jobId}")
    public ResponseEntity<List<Apply>> getApplicationsByJob(@PathVariable Long jobId) {
        List<Apply> applications = applyService.getApplicationsByJob(jobId);
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }
}
