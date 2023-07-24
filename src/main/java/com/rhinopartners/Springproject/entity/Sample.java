package com.rhinopartners.Springproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="sample_one")
public class Sample {
    @Id
    int id;
    @Column(nullable = false)
    String reference;
    @Column(nullable = false)
    int amount;
    @Column(nullable = false)
    String createAs;
    @Column(nullable = false)
    String feedback;    
}
