package com.odutayo.APIController.controller;

import com.odutayo.APIController.dto.AddressResponse;
import com.odutayo.APIController.dto.BorrowerResponse;
import com.odutayo.APIController.dto.EmployeeResponse;
import com.odutayo.APIController.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ApiController {

    private ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }


    @GetMapping("/borrower-service/{id}")
    public BorrowerResponse gettingBorrowerById(@PathVariable Long id){
        return apiService.getBorrowerById(id);
    }


    @GetMapping("/borrower-service/all")
    public List<BorrowerResponse> gettingAllBorrowers(){
        return apiService.getAllBorrowers();
    }

    @GetMapping("/employee-service/{id}")
    public EmployeeResponse gettingEmployeeById(@PathVariable Long id){
        return apiService.getEmployeeById(id);
    }


    @GetMapping("/employee-service/all")
    public List<EmployeeResponse> gettingAllEmployees(){
        return apiService.getAllEmployees();
    }


    @GetMapping("/address-service/{id}")
    public AddressResponse gettingAddressById(@PathVariable Long id){
        return apiService.getAddressById(id);
    }


    @GetMapping("/address-service/all")
    public List<AddressResponse> gettingAllAddresses(){
        return apiService.getAllAddresses();
    }


}
