package org.example;

import java.util.Date;

public class Task {
    String taskName;
    String assignee;
    Date dueDate;
    Date startDate;

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getTaskName() {
        return taskName;
    }

    public boolean assignTask(String assignee) {
        this.assignee = assignee;
        return true;
    }

    public boolean dueTask(String dueDate) {
        return Date.now().isAfter(dueDate);
    }
}
