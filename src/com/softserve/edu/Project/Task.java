package com.softserve.edu.Project;

import java.time.LocalDate;


public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean isComplete;
    private Priority priority;

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    public Task(String title, String description, LocalDate dueDate, boolean isComplete, Priority priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = isComplete;
        this.priority = priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public Priority getPriority() {
        return priority;
    }
    public boolean getComplite(){
        return isComplete;
    }

     
    
}
