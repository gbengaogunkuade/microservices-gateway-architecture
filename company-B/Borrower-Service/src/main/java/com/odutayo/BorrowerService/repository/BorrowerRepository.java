package com.odutayo.BorrowerService.repository;

import com.odutayo.BorrowerService.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

    Borrower findBorrowerById(Long id);

}
