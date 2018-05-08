package com.kubik;

import java.util.ArrayList;

public class Category extends CourseWork {
    private ArrayList<Assignment> assignmentList;

    public Category(String name, float weight) {
        setName(name);
        setWeight(weight);

        assignmentList = new ArrayList<>(2);
    }

    @Override
    public float getGrade() {
        float netGrade = 0;

        for (Assignment assignment: assignmentList) {
            netGrade += assignment.getGrade();
        }

        netGrade /= assignmentList.size();

        return netGrade;
    }

    public void addAssignment(Assignment assignment) {
        assignmentList.add(assignment);
    }
}
