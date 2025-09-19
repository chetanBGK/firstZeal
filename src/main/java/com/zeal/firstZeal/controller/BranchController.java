package com.zeal.firstZeal.controller;

import com.zeal.firstZeal.entity.Branch;
import com.zeal.firstZeal.services.BranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchController {

    @Autowired
    BranchServices branchService;

    @PostMapping("createbranch")
    public Branch createBranch(@RequestBody Branch branch){
        return branchService.createBranch(branch);
    }

    @GetMapping("getallbranch")
    public List<Branch> getAllBranch(){
        return branchService.getAllBranch();
    }

    @GetMapping("getbyid/{branchId}")
    public Branch getBranchById(@PathVariable int branchId){
        return branchService.getBranchById(branchId);
    }

    @PutMapping("updatebranch/{branchid}")
    public Branch updateBranch(@PathVariable int branchid
            ,@RequestBody Branch branch)
    {
        return branchService.updateBranch(branchid,branch);

    }

    @DeleteMapping("deletebranch/{branchid}")
    public String deleteBranch(@PathVariable int branchid)
    {
        branchService.deleteBranch(branchid);
        return "Branch deleted";
    }
}
