package com.ogunkuade.specs.service;


import com.ogunkuade.specs.dto.*;
import com.ogunkuade.specs.feignclient.AddressClient;
import com.ogunkuade.specs.feignclient.EmployeeClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SpecsService {


    //SPRING CLOUD LOAD BALANCER
    private LoadBalancerClient loadBalancerClient;


    private EmployeeClient employeeClient;
    private AddressClient addressClient;


    public SpecsService(LoadBalancerClient loadBalancerClient, EmployeeClient employeeClient, AddressClient addressClient) {
        this.loadBalancerClient = loadBalancerClient;
        this.employeeClient = employeeClient;
        this.addressClient = addressClient;
    }



    //------------------CREATE NEW EMPLOYEE------------------------
    public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest){
        EmployeeResponse employeeResponse = employeeClient.savingEmployee(employeeRequest);
        return employeeResponse;
    }


    //------------------CREATE NEW ADDRESS------------------------
    public AddressResponse saveAddress(AddressRequest addressRequest){
        AddressResponse addressResponse = addressClient.savingAddress(addressRequest);
        return addressResponse;
    }



    //--------------------GET EMPLOYEE BY ID------------------------
    public EmployeeResponse getEmployeeById(Long id){
        EmployeeResponse employeeResponse = employeeClient.gettingEmployeeById(id);
        return employeeResponse;
    }



    //--------------------GET ADDRESS BY ID------------------------
    public AddressResponse getAddressById(Long id){
        AddressResponse addressResponse = addressClient.gettingAddressById(id);
        return addressResponse;
    }



    //--------------------GET SPECS BY ID------------------------
    public SpecsResponse getSpecsById(Long id){
        SpecsResponse specsResponse = new SpecsResponse();
        EmployeeResponse employeeResponse = employeeClient.gettingEmployeeById(id);
        AddressResponse addressResponse = addressClient.gettingAddressById(id);

        if(employeeResponse != null){
            specsResponse.setEmployeeResponse(employeeResponse);
        }

        if(addressResponse != null){
            specsResponse.setAddressResponse(addressResponse);
        }

        return specsResponse;
    }




//    //--------------------GET SPECS BY ID------------------------
//    public ResponseEntity<SpecsResponse> getSpecsById(Long id){
//        SpecsResponse specsResponse = new SpecsResponse();
//        EmployeeResponse employeeResponse = employeeClient.gettingEmployeeById(id);
//        AddressResponse addressResponse = addressClient.gettingAddressById(id);
//
//        if(employeeResponse != null){
//            specsResponse.setEmployeeResponse(employeeResponse);
//        }
//
//        if(addressResponse != null){
//            specsResponse.setAddressResponse(addressResponse);
//        }
//
//        return ResponseEntity.status(HttpStatus.OK).body(specsResponse);
//    }



    //--------------------GET ALL EMPLOYEES------------------------
    public List<EmployeeResponse> getAllEmployees(){
        List<EmployeeResponse> allEmployeesResponseEntity = employeeClient.gettingAllEmployees();
        return allEmployeesResponseEntity;
    }




    //-------------------GET ALL ADDRESSES-------------------------
    public List<AddressResponse> getAllAddresses(){
        List<AddressResponse> allAddressesResponseEntity = addressClient.gettingAllAddresses();
        return allAddressesResponseEntity;
    }



    //-------------------CREATE BOTH NEW EMPLOYEE AND NEW ADDRESS FROM SPECS-------------------------
    public SpecsResponse saveSpecs(SpecsRequest specsRequest){

        EmployeeRequest employeeRequest = new EmployeeRequest(
                specsRequest.getName(),
                specsRequest.getEmail(),
                specsRequest.getBloodGroup()
        );

        AddressRequest addressRequest = new AddressRequest(
                specsRequest.getLane1(),
                specsRequest.getLane2(),
                specsRequest.getZip(),
                specsRequest.getState()
        );

        EmployeeResponse employeeResponse = employeeClient.savingEmployee(employeeRequest);
        AddressResponse addressResponse = addressClient.savingAddress(addressRequest);

        SpecsResponse specsResponse = new SpecsResponse(employeeResponse, addressResponse);
        return specsResponse;
    }



}



