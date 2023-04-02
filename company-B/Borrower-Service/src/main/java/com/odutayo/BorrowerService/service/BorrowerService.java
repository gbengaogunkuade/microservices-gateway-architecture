package com.odutayo.BorrowerService.service;


import com.odutayo.BorrowerService.dto.BorrowerRequest;
import com.odutayo.BorrowerService.dto.BorrowerResponse;
import com.odutayo.BorrowerService.entity.Borrower;
import com.odutayo.BorrowerService.repository.BorrowerRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowerService {

    private BorrowerRepository borrowerRepository;

    public BorrowerService(BorrowerRepository borrowerRepository) {
        this.borrowerRepository = borrowerRepository;
    }


    public BorrowerResponse createBorrower(BorrowerRequest borrowerRequest){
        Borrower borrowerNew = new Borrower(
                borrowerRequest.getName()
        );
        Borrower borrower = borrowerRepository.save(borrowerNew);
        BorrowerResponse borrowerResponse = new BorrowerResponse(
                borrower.getId(),
                borrower.getName()
        );
        return borrowerResponse;
    }


    public BorrowerResponse getBorrowerById(Long id){
        try{
            Borrower borrower = borrowerRepository.findBorrowerById(id);
            BorrowerResponse borrowerResponse = new BorrowerResponse(
                    borrower.getId(),
                    borrower.getName()
            );
            return borrowerResponse;
        }
        catch(Exception e){
            System.out.println(String.format("Borrower with the ID %d not found", id));
            return new BorrowerResponse();
        }
    }


    public List<BorrowerResponse> getAllBorrowers(){
        List<Borrower> borrowerList =  borrowerRepository.findAll();
        List<BorrowerResponse> borrowerResponseList = new ArrayList<>();

        for(Borrower borrower : borrowerList){
            borrowerResponseList.add(new BorrowerResponse(
                    borrower.getId(),
                    borrower.getName()
            ));
        }
        return borrowerResponseList;
    }



}
