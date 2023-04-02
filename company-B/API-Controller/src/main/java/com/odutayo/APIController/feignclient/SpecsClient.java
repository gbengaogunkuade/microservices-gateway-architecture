package com.odutayo.APIController.feignclient;


import com.odutayo.APIController.dto.AddressResponse;
import com.odutayo.APIController.dto.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


//url for external API
@FeignClient(name = "SPECS-SERVICE", url = "localhost:9000/specs-app/api/specs")
public interface SpecsClient {

    @GetMapping("/employee-service/{id}")
    EmployeeResponse gettingEmployeeById(@PathVariable Long id);

    @GetMapping("/employee-service/all")
    List<EmployeeResponse> gettingAllEmployees();

    @GetMapping("/address-service/{id}")
    AddressResponse gettingAddressById(@PathVariable Long id);


    @GetMapping("/address-service/all")
    List<AddressResponse> gettingAllAddresses();


}


