package com.odutayo.APIController.feignclient;


import com.odutayo.APIController.dto.BorrowerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//path for internal API
@FeignClient(name = "BORROWER-SERVICE", path = "/borrower-app/api/borrower")
public interface BorrowerClient {

    @GetMapping("/{id}")
    BorrowerResponse gettingBorrowerById(@PathVariable Long id);

    @GetMapping("/all")
    List<BorrowerResponse> gettingAllBorrowers();



}
