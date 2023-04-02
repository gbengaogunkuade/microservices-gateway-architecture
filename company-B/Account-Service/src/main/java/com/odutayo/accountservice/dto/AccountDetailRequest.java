package com.odutayo.accountservice.dto;


public class AccountDetailRequest {

    private Long id;
    private String bank;
    private String location;
    private Long accountNumber;

    public AccountDetailRequest() {
    }

    public AccountDetailRequest(String bank, String location, Long accountNumber) {
        this.bank = bank;
        this.location = location;
        this.accountNumber = accountNumber;
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

    @Override
    public String toString() {
        return "AccountDetailRequest{" +
                "id=" + id +
                ", bank='" + bank + '\'' +
                ", location='" + location + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
