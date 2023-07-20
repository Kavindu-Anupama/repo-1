package com.rhinopartners.Springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sample {
    int id;
    String reference;
    int amount;
    String createAs;
    String Feedback;    
}
