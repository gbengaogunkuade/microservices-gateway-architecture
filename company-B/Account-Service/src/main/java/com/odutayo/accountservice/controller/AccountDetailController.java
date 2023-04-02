package com.odutayo.accountservice.controller;


import com.odutayo.accountservice.dto.*;
import com.odutayo.accountservice.service.AccountDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/accountdetail")
public class AccountDetailController {

    private AccountDetailService accountDetailService;

    public AccountDetailController(AccountDetailService accountDetailService) {
        this.accountDetailService = accountDetailService;
    }


    @PostMapping("/create")
    public AccountDetailResponse creatingAccountDetails(@RequestBody AccountDetailRequest accountDetailRequest){
        return accountDetailService.saveAccountDetail(accountDetailRequest);
    }


    @GetMapping("/{id}")
    public AccountDetailResponse gettingAccountDetailById(@PathVariable Long id){
        return accountDetailService.getAccountDetailById(id);
    }


    @GetMapping("/all")
    public List<AccountDetailResponse> gettingAllAccountDetails(){
        return accountDetailService.getAllAccountDetails();
    }



}
