package com.zeal.firstZeal.services;

import com.zeal.firstZeal.entity.Branch;

import java.util.List;

public interface BranchServices {
   Branch createBranch(Branch branch);

    List<Branch> getAllBranch();

    Branch getBranchById(int branchId);

    Branch updateBranch(int branchid, Branch branch);

    void deleteBranch(int branchId);
}
