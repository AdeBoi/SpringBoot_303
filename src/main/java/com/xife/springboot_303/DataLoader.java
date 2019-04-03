package com.xife.springboot_303;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception
    {
        Course course = new Course("Astrophysics", "Neil D Tyson", "Just a courseon stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Hen", "Rate Change", 9);
        repository.save(course);

        course = new Course("English", "Tarol Fen", "Grammar Learner", 2);
        repository.save(course);
    }
}