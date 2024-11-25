package com.webAvance.backendProject.Company.Contoller;

import com.webAvance.backendProject.Company.Models.Job;
import com.webAvance.backendProject.Company.Service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {
    @Autowired
    jobService jobService;

    @GetMapping("/all")
    public List<Job> getAllJobs(){
        return jobService.getAll();
    }

    @GetMapping("/{id}")
    public Job getOneJob(@PathVariable Long id){
        return jobService.getOne(id);
    }

    @PostMapping("/save")
    public Job saveJob(@RequestBody Job job){
        return jobService.add(job);
    }

    @PutMapping("/update/{id}")
    public Job updateJob(@PathVariable Long id , @RequestBody Job job) {
        return jobService.update(id, job);
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String, String> deleteJob(@PathVariable Long id) {
        return jobService.delete(id);

    }
}
