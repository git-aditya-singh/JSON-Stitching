package com.jsonstitching.stitching.MyController.Entities.Entitydep;

public class StudentInfo {
    String StudentName;

   public StudentInfo() {
       super();
   }

   public StudentInfo(String StudentName) {
       super();
       this.StudentName = StudentName;
   }

   public String getStudentName() {
       return this.StudentName;
   }

   public void setStudentName(String StudentName) {
       this.StudentName = StudentName;
   }

   @Override
   public String toString() {
       return "{" +
           " StudentName='" + getStudentName() + "'" +
           "}";
   }

}

