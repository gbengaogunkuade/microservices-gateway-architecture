package com.odutayo.BorrowerService.controller;


import com.odutayo.BorrowerService.dto.BorrowerRequest;
import com.odutayo.BorrowerService.dto.BorrowerResponse;
import com.odutayo.BorrowerService.service.BorrowerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/borrower")
public class BorrowerController {

    private BorrowerService borrowerService;

    public BorrowerController(BorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }


    @PostMapping("/create")
    public BorrowerResponse creatingBorrower(@RequestBody BorrowerRequest borrowerRequest){
        return borrowerService.createBorrower(borrowerRequest);
    }


    @GetMapping("/{id}")
    public BorrowerResponse gettingBorrowerById(@PathVariable Long id){
        System.out.println("Getting Borrower By Id");
        return borrowerService.getBorrowerById(id);
    }


    @GetMapping("/all")
    public List<BorrowerResponse> gettingAllBorrowers(){
        System.out.println("Getting All Borrowers");
        return borrowerService.getAllBorrowers();
    }



}
