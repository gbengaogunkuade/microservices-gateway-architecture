package com.odutayo.APIController.service;


import com.odutayo.APIController.dto.AddressResponse;
import com.odutayo.APIController.dto.BorrowerResponse;
import com.odutayo.APIController.dto.EmployeeResponse;
import com.odutayo.APIController.feignclient.BorrowerClient;
import com.odutayo.APIController.feignclient.SpecsClient;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ApiService {

    private SpecsClient specsClient;
    private BorrowerClient borrowerClient;


    public ApiService(SpecsClient specsClient, BorrowerClient borrowerClient) {
        this.specsClient = specsClient;
        this.borrowerClient = borrowerClient;
    }

    public BorrowerResponse getBorrowerById(Long id){
        BorrowerResponse borrowerResponse = borrowerClient.gettingBorrowerById(id);
        return borrowerResponse;
    }


    public List<BorrowerResponse> getAllBorrowers(){
        List<BorrowerResponse> borrowerResponseList = borrowerClient.gettingAllBorrowers();
        return borrowerResponseList;
    }


    public EmployeeResponse getEmployeeById(Long id){
        EmployeeResponse employeeResponse = specsClient.gettingEmployeeById(id);
        return employeeResponse;
    }


    public List<EmployeeResponse> getAllEmployees(){
        List<EmployeeResponse> employeeResponseList = specsClient.gettingAllEmployees();
        return employeeResponseList;
    }



    public AddressResponse getAddressById(Long id){
        AddressResponse addressResponse = specsClient.gettingAddressById(id);
        return addressResponse;
    }


    public List<AddressResponse> getAllAddresses(){
        List<AddressResponse> addressResponseList = specsClient.gettingAllAddresses();
        return addressResponseList;
    }




}
