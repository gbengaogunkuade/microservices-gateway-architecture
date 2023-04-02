package com.odutayo.accountservice.service;


import com.odutayo.accountservice.dto.*;
import com.odutayo.accountservice.entity.AccountDetail;
import com.odutayo.accountservice.repository.AccountDetailRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class AccountDetailService {

    private AccountDetailRepository accountDetailRepository;

    public AccountDetailService(AccountDetailRepository accountDetailRepository) {
        this.accountDetailRepository = accountDetailRepository;
    }

    public AccountDetailResponse saveAccountDetail(AccountDetailRequest accountDetailRequest){
        AccountDetail accountDetailNew = new AccountDetail(
                accountDetailRequest.getBank(),
                accountDetailRequest.getLocation(),
                accountDetailRequest.getAccountNumber()
        );
        AccountDetail accountDetail = accountDetailRepository.save(accountDetailNew);
        AccountDetailResponse accountDetailResponse = new AccountDetailResponse(
                accountDetail.getId(),
                accountDetail.getBank(),
                accountDetail.getLocation(),
                accountDetail.getAccountNumber()
        );
        return accountDetailResponse;
    }


    public AccountDetailResponse getAccountDetailById(Long id){
        try{
            AccountDetail accountDetail = accountDetailRepository.findAccountDetailById(id);
            AccountDetailResponse accountDetailResponse = new AccountDetailResponse(
                    accountDetail.getId(),
                    accountDetail.getBank(),
                    accountDetail.getLocation(),
                    accountDetail.getAccountNumber()
            );
            return accountDetailResponse;
        }
        catch(Exception e){
            System.out.println(String.format("No Account Detail with an id %d in our database", id));
            return new AccountDetailResponse();
        }
    }


    public List<AccountDetailResponse> getAllAccountDetails(){
        List<AccountDetail> accountDetailList = accountDetailRepository.findAll();
        List<AccountDetailResponse> accountDetailResponseList = new ArrayList<>();

        for(AccountDetail accountDetail : accountDetailList){
            accountDetailResponseList.add(new AccountDetailResponse(
                    accountDetail.getId(),
                    accountDetail.getBank(),
                    accountDetail.getLocation(),
                    accountDetail.getAccountNumber()
            ));
        }
        return accountDetailResponseList;
    }


}
