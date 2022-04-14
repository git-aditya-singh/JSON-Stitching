package com.jsonstitching.stitching.MyController.Services;

import com.jsonstitching.stitching.MyController.Entities.Result;
import com.jsonstitching.stitching.MyController.Entities.Entitydep.StudentInfo;

public interface JsonServices {
    public Result solve(StudentInfo si);
}
