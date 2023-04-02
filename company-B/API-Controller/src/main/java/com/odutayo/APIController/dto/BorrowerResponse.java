package com.odutayo.APIController.dto;



public class BorrowerResponse {

    private Long id;
    private String name;

    public BorrowerResponse() {
    }

    public BorrowerResponse(Long id, String name) {
        this.id = id;
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
