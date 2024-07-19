package com.jeran.JobApp_1.repo;

import com.jeran.JobApp_1.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must Have good Knowledge in core java",2,List.of("Core Java")),
            new JobPost(2,"Python Developer","Must Have good Knowledge in Basic python",2,List.of("Django","Basic Python")),
            new JobPost(3, "Network Engineer","Design and implement computer networks for efficient data communication", 5, List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(4, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(5, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),
            new JobPost(6, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces", 2, List.of("User Experience", "User Interface Design", "Prototyping"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJobs(JobPost job){
        jobs.add(job);
    }
}
