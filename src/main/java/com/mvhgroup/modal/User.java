package com.mvhgroup.modal;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mvhgroup.domain.USER_ROLE;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(access =JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String email;
    private String fullName;
    private String mobile;
    private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
















    private  Set<Address> addresses = new HashSet<>();

    private Set<Coupon> usedCoupons = new HashSet<>();




}
