package com.kubik;

import java.util.ArrayList;

public class Course {
    private String name;
    private String section;
    private ArrayList<Category> categoryList;
    private ArrayList<Assignment> assignmentList;


    public void Course(String name, String section) {
        this.name = name;
        this.section = section;
    }

    public void addCategory(Category category) {

    }

    public void removeCategory(String categoryName) {

    }

    // GENERATED GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public ArrayList<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(ArrayList<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }
}
