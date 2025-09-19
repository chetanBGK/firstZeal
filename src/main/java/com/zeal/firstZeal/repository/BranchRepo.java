package com.zeal.firstZeal.repository;

import com.zeal.firstZeal.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, Integer> {
}
