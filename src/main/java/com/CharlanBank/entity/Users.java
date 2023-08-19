package com.CharlanBank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users extends BaseClass{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private String gender;
    private String stateOfOrigin;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String phoneNumber;
    private String alternativePhoneNumber;
    private String status;
}
