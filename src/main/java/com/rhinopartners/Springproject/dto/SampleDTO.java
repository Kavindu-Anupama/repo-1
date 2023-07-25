package com.rhinopartners.Springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SampleDTO {
    private int id;
    private String reference;
    private int amount;
    private String createAs;
    private String feedback;
}
