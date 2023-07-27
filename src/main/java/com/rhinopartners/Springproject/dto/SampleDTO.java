package com.rhinopartners.Springproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SampleDTO {
    @NotBlank(message = "id can not be empty")
    @Pattern(regexp = "^[0-9]+$", message = "Invalid id")
    private int id;
    @NotBlank(message = "Reference can not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid reference name")
    private String reference;
    @NotBlank(message = "Amount can not be empty")
    @Pattern(regexp = "^[0-9]+$", message = "Invalid amount")
    private int amount;
    @NotBlank(message = "Created name can not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid created name")
    private String createAs;
    @NotBlank(message = "Feedback can not be empty")
    @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Invalid feedback")
    private String feedback;
}
