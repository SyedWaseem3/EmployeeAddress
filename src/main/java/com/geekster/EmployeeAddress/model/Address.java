package com.geekster.EmployeeAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Long addressId;
    private String addressStreet;
    private String addressCity;
    private String addressState;
    private String addressZipCode;
}
