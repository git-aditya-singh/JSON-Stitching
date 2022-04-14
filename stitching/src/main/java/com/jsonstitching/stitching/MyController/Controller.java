package com.jsonstitching.stitching.MyController;

import com.jsonstitching.stitching.MyController.Services.*;

import com.jsonstitching.stitching.MyController.Entities.Result;
import com.jsonstitching.stitching.MyController.Entities.Entitydep.StudentInfo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @PostMapping(path="/Val",consumes="application/json")
    public Result Process(@RequestBody StudentInfo si){
        JsonServices t=new JsonServicesimpl();
        return t.solve(si);
    }
     
    
}
