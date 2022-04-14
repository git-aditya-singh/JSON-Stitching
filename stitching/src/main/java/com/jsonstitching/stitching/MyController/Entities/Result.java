package com.jsonstitching.stitching.MyController.Entities;
import com.jsonstitching.stitching.MyController.Entities.Entitydep.*;

public class Result {
     StudentInfo StudentInfo;
     CollegeInfo CollegeInfo;

    public Result() {
    }

    public Result(StudentInfo StudentInfo, CollegeInfo CollegeInfo) {
        this.StudentInfo = StudentInfo;
        this.CollegeInfo = CollegeInfo;
    }

    public StudentInfo getStudentInfo() {
        return this.StudentInfo;
    }

    public void setStudentInfo(StudentInfo StudentInfo) {
        this.StudentInfo = StudentInfo;
    }

    public CollegeInfo getCollegeInfo() {
        return this.CollegeInfo;
    }

    public void setCollegeInfo(CollegeInfo CollegeInfo) {
        this.CollegeInfo = CollegeInfo;
    }

    @Override
    public String toString() {
        return "{" +
            " StudentInfo='" + getStudentInfo() + "'" +
            ", CollegeInfo='" + getCollegeInfo() + "'" +
            "}";
    }


}
