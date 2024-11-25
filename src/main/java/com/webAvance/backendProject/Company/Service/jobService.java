package com.webAvance.backendProject.Company.Service;

import com.webAvance.backendProject.Company.Models.Job;
import com.webAvance.backendProject.Company.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class jobService {

    @Autowired
    private JobRepository JobRepository;

    public jobService(){

    }

    public List<Job> getAll(){
        return JobRepository.findAll();
    }

    public Job getOne(Long id){
        return JobRepository.findById(id).get();
    }

    public Job add(Job job){
        return JobRepository.save(job);
    }

    public Job update(Long id ,Job job) {
        Job j = JobRepository.findById(id).get();
        if (j != null) {
            j.setId_jobs(id);
            j.setTitle_jobs(job.getTitle_jobs());
            j.setDesc_jobs(job.getDesc_jobs());
            j.setCompetences(job.getCompetences());
            j.setType_job(job.getType_job());
            j.setLocation_job(job.getLocation_job());
            j.setEducation_level(job.getEducation_level());
            j.setSalery(job.getSalery());
            j.setDate_posted(job.getDate_posted());
            j.setDate_expired(job.getDate_expired());

            return  JobRepository.save(job);
        }else{
            throw  new RuntimeException("Fail");
        }
    }


    public HashMap<String, String> delete(Long id){
        HashMap<String, String> message = new HashMap<>();
        try{
            JobRepository.deleteById(id);
            message.put("Etat","Job deleted");
        }catch (Exception e){
            message.put("Etat","Job not deleted");
        }
        return message;
    }
}
