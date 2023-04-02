package com.odutayo.accountservice.repository;

import com.odutayo.accountservice.entity.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountDetailRepository extends JpaRepository<AccountDetail, Long> {

    AccountDetail findAccountDetailById(Long id);

}



