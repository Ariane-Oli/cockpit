package com.cockpit.cockpitbackend.adapters.input.dto;

public class PaginationRequest {

    private int page;
    private int size;

    public PaginationRequest(int page, int size){
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public PaginationRequest(){

    }
}
