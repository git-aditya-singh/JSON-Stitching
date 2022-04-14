package com.jsonstitching.stitching.MyController.Entities.Entitydep;

public class CollegeInfo {
    int RollNo;
   
    public CollegeInfo() {
        super();
    }
   
    public CollegeInfo(int RollNo) {
        super();
        this.RollNo = RollNo;
    }
   
    public int getRollNo() {
       return this.RollNo;
    }
   
    public void setRollNo(int RollNo) {
       this.RollNo = RollNo;
    }
   
    @Override
    public String toString() {
       return "{" +
           " RollNo='" + getRollNo() + "'" +
           "}";
    }
   
}
