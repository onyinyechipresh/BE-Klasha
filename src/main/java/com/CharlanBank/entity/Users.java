package com.CharlanBank.entity;

import com.CharlanBank.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Users extends BaseClass{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "firstname", length = 100)
    private String firstName;
    @Column(name = "lastname", length = 100)
    private String lastName;
    @Column(name = "othername", length = 100)
    private String otherName;
    @Column(name = "email", unique = true, length = 100)
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String address;
    private String stateOfOrigin;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String phoneNumber;
    private String status;
}
