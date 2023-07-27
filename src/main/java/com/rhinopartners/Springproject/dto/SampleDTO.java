package com.rhinopartners.Springproject.dto;

import java.io.Serializable;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SampleDTO implements Serializable {
    @NotNull(message = "id can not be empty")
    private int id;
    @NotBlank(message = "Reference can not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid reference name")
    private String reference;
    @NotNull(message = "Amount can not be empty")
    private int amount;
    @NotBlank(message = "Created name can not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid created name")
    private String createAs;
    @NotBlank(message = "Feedback can not be empty")
    @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Invalid feedback")
    private String feedback;
}
