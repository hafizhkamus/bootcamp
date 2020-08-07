package com.java.collection;

import java.util.*;
import java.sql.Date;

public class Employee{

    private String id;
    private String name;
    private String jobTitle;
    private Date birthDate;

    public Employee(String name, String jobTitle, Date birthDate){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.jobTitle = jobTitle;
        this.birthDate = birthDate;

    }

    public Employee(){

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle =jobTitle;
    }

    public Date getBirthDate(){
        return  birthDate;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
}