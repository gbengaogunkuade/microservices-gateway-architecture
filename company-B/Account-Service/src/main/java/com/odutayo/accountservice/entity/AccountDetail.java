package com.odutayo.accountservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity(name = "accountdetail")
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bank;
    private String location;
    private Long accountNumber;
    private Date openingDate;


    public AccountDetail() {
    }

    public AccountDetail(String bank, String location, Long accountNumber) {
        this.bank = bank;
        this.location = location;
        this.accountNumber = accountNumber;
        this.openingDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    @Override
    public String toString() {
        return "AccountDetail{" +
                "id=" + id +
                ", bank='" + bank + '\'' +
                ", location='" + location + '\'' +
                ", accountNumber=" + accountNumber +
                ", openingDate=" + openingDate +
                '}';
    }


}
