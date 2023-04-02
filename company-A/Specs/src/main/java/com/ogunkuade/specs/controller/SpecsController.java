package com.ogunkuade.specs.controller;


import com.ogunkuade.specs.dto.*;
import com.ogunkuade.specs.service.SpecsService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/specs")
public class SpecsController {

    private SpecsService specsService;


    public SpecsController(SpecsService specsService) {
        this.specsService = specsService;
    }

    @PostMapping("/employee-service/create")
    public EmployeeResponse savingEmployee(@RequestBody EmployeeRequest employeeRequest){
        return specsService.saveEmployee(employeeRequest);
    }


    @PostMapping("/address-service/create")
    public AddressResponse savingAddress(@RequestBody AddressRequest addressRequest){
        return specsService.saveAddress(addressRequest);
    }

    @GetMapping("/employee-service/{id}")
    public EmployeeResponse gettingEmployeeById(@PathVariable Long id){
        return specsService.getEmployeeById(id);
    }

    @GetMapping("/address-service/{id}")
    public AddressResponse gettingAddressById(@PathVariable Long id){
        return specsService.getAddressById(id);
    }


    @GetMapping("/{id}")
    public SpecsResponse gettingSpecsById(@PathVariable Long id){
        return specsService.getSpecsById(id);
    }


    @GetMapping("/employee-service/all")
    public List<EmployeeResponse> gettingAllEmployees(){
        return specsService.getAllEmployees();
    }


    @GetMapping("/address-service/all")
    public List<AddressResponse> gettingAllAddresses(){
        return specsService.getAllAddresses();
    }

    @PostMapping("/create")
    public SpecsResponse savingSpecs(@RequestBody SpecsRequest specsRequest){
        System.out.println(specsRequest);
        return specsService.saveSpecs(specsRequest);
    }



}
