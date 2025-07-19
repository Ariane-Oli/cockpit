package com.cockpit.cockpitbackend.adapters.input.dto;

public class PaginationRequest {

    private int page = 0;
    private int size = 10;

    public PaginationRequest(){

    }
    public PaginationRequest(int page, int size){
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(){
        this.size = size;
    }


}
