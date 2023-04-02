package com.odutayo.BorrowerService.dto;


public class BorrowerRequest {

    private Long id;
    private String name;

    public BorrowerRequest() {
    }

    public BorrowerRequest(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BorrowerResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
