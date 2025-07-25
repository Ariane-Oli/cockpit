package com.cockpit.cockpitbackend.adapters.output.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedResponse<T>{
    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    @JsonProperty("totalPages")
    private int totalPages;

}

