package com.group.eratosthenes.questiontwo;

import java.util.Date;

public class Employee {
    private boolean managerFlag;
    private String name;
    private Date dateHired;
    private int id;
    private boolean partTimeFlag;

    public Employee(String name, int id, Date dateHired, boolean managerFlag, boolean partTimeFlag) {
        this.name = name;
        this.id = id;
        this.dateHired = dateHired;
        this.managerFlag = managerFlag;
        this.partTimeFlag = partTimeFlag;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public boolean isManager() {
        return managerFlag;
    }

    public boolean isPartTime() {
        return partTimeFlag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setManager(boolean managerFlag) {
        this.managerFlag = managerFlag;
    }

    public void setPartTime(boolean partTimeFlag) {
        this.partTimeFlag = partTimeFlag;
    }
}
