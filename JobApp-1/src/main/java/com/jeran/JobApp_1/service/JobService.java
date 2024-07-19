package com.jeran.JobApp_1.service;

import com.jeran.JobApp_1.model.JobPost;
import com.jeran.JobApp_1.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJobs(jobPost);
    }

    public List<JobPost> getAllJobs(){
    return repo.getAllJobs();
    }
}
