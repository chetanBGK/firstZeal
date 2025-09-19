package com.zeal.firstZeal.serviceImpl;

import com.zeal.firstZeal.entity.Branch;
import com.zeal.firstZeal.entity.Student;
import com.zeal.firstZeal.repository.BranchRepo;
import com.zeal.firstZeal.services.BranchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchServices {

    @Autowired
    BranchRepo branchRepo;

    @Override
    public Branch createBranch(Branch branch) {
        return branchRepo.save(branch);
    }

    @Override
    public List<Branch> getAllBranch() {
        return branchRepo.findAll();
    }

    @Override
    public Branch getBranchById(int branchId) {
        return branchRepo.findById(branchId).get();
    }

    @Override
    public Branch updateBranch(int branchid, Branch branch) {
        Branch existingBranch = branchRepo.findById(branchid).get();
        existingBranch.setBranchName(branch.getBranchName());
        branchRepo.save(existingBranch);

        return existingBranch;
    }

    @Override
    public void deleteBranch(int branchId) {
        branchRepo.deleteById(branchId);
    }
}
