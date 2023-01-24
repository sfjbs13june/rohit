package com.rohit.app.controller;

import com.rohit.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController
{
    @GetMapping("/get/students")
    public List<Student> getStudents()
    {
        List listStudents = new ArrayList();
        Student S1 = new Student("rahul",212,"9","DPS");
        Student S2 = new Student("ronak",214,"9","NIS");
        Student S3 = new Student("paresh",215,"9","MIT");

        listStudents.add(S1);
        listStudents.add(S2);
        listStudents.add(S3);
        return listStudents;
    }

    @GetMapping("/map/students")
    public Map mapStudents()
    {
        Map StudentMap = new HashMap();
        Student S1 = new Student("rahul",212,"9","DPS");
        Student S2 = new Student("ronak",214,"9","NIS");
        Student S3 = new Student("paresh",215,"9","MIT");

        StudentMap.put(S1.getName(),S1);
        StudentMap.put(S2.getName(),S2);
        StudentMap.put(S3.getName(),S3);
        return StudentMap;
    }
}
