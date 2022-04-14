package com.jsonstitching.stitching.MyController.Services;

import com.jsonstitching.stitching.MyController.Entities.Result;
import com.jsonstitching.stitching.MyController.Entities.Entitydep.CollegeInfo;
import com.jsonstitching.stitching.MyController.Entities.Entitydep.StudentInfo;

import org.springframework.stereotype.Service;
@Service
public class JsonServicesimpl implements JsonServices{
    Result res;
    @Override
    public Result solve(StudentInfo si) {
        res=new Result();
        res.setStudentInfo(si);
        res.setCollegeInfo(new CollegeInfo(14));
        return res;
    }

    public JsonServicesimpl() {
        res=new Result();
    }

}
